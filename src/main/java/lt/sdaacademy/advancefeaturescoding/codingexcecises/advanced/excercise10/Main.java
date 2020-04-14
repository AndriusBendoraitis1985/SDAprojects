package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10;

/*Implement a traditional vending machine which:
 * Allow user to select products - the menu is displayed in console.
 * Allow user to select what coins to insert - menu is displayed in console.
 * Allow user to take refund by canceling the request.
 * Return selected product and remaining change if any.
 * The state of the vending machine is saved in a file on the disk - a json file.
 * Vending Machine has the product menu configurable - new products can be added in the json file.
 * Vending Machine is configurable on what coins it accepts - new coins can be added in the json file.*/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Coin;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Product;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.Read;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.VendingMachine;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachineStock = Read.read();
        assert vendingMachineStock != null;

        Map<Product, Integer> productStock = vendingMachineStock.getProductStock();
        Map<Coin, Integer> coinStock = vendingMachineStock.getCoinStock();
        Map<Product, Integer> selectedProducts = getSelectProductMap(productStock);
        int totalCostOfProducts = getTotalCostOfAllSelectedProducts(selectedProducts);
        System.out.println("Product cost=" + totalCostOfProducts);
        Map<Coin, Integer> insertedCoins = getInsertedCoinsMap(coinStock);
        int totalValueOfInsertedCoints = getTotalValueOfAllInsertedCoins(insertedCoins);
        System.out.println("Inserted coins value=" + totalValueOfInsertedCoints);

        Scanner inputText = new Scanner(System.in);
        System.out.println("Do you want to cancel your order? Yes:No");
        if (inputText.nextLine().toLowerCase().equals("yes")) {
            vendingMachineStock = Read.read();
            selectedProducts.clear();
            insertedCoins.clear();
        } else {
            if (totalCostOfProducts > totalValueOfInsertedCoints) {
                System.out.println("Insufficient coins value. Please insert more coins.");
                getInsertedCoinsMap(coinStock);

            }
        }

        System.out.println("");

        selectedProducts.entrySet().forEach(System.out::println);
        insertedCoins.entrySet().forEach(System.out::println);


    }

    private static Map<Product, Integer> getSelectProductMap(Map<Product, Integer> productStock) {
        Map<Product, Integer> selectedProducts = new HashMap<>();
        boolean repeat = true;
        while (repeat) {
            System.out.println("Please select a product:");
            productStock.entrySet().stream()
                    .filter(Product -> Product.getValue() != 0)
                    .forEach(Product -> System.out.println(Product.getKey()));
            System.out.println("\nTo confirm your choice, please write product code.");
            Scanner codeInput = new Scanner(System.in);
            int requestedCodeByUser = codeInput.nextInt();
            if (productStock.entrySet().stream().anyMatch(code -> code.getKey().getCod() == requestedCodeByUser)) {
                Product requestedProduct = productStock.keySet().stream()
                        .filter(code -> code.getCod() == requestedCodeByUser)
                        .findFirst()
                        .get();
                if (selectedProducts.containsKey(requestedProduct)) {
                    selectedProducts.replace(requestedProduct, (selectedProducts.get(requestedProduct) + 1));
                }
                if (!selectedProducts.containsKey(requestedProduct)) {
                    selectedProducts.put(requestedProduct, 1);
                }
                if (productStock.get(requestedProduct) > 1) {
                    productStock.replace(requestedProduct, (productStock.get(requestedProduct) - 1));
                } else {
                    productStock.remove(requestedProduct);
                }
            } else {
                System.out.println("Please check your choice");
            }
            System.out.println("Do You want to select another product? Yes/No");
            Scanner textInput = new Scanner(System.in);
            String answer = textInput.nextLine();
            if (answer.toLowerCase().equals("no")) {
                repeat = false;
            }
        }
        return selectedProducts;
    }

    private static int getTotalCostOfAllSelectedProducts(Map<Product, Integer> selectedProducts) {
        int totalCostOfProducts = 0;
        for (Map.Entry<Product, Integer> product : selectedProducts.entrySet()) {
            totalCostOfProducts += product.getKey().getPrice() * product.getValue();
        }
        return totalCostOfProducts;
    }

    private static Map<Coin, Integer> getInsertedCoinsMap(Map<Coin, Integer> coinStock) {
        Map<Coin, Integer> insertedCoins = new HashMap<>();
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        boolean repeatInsertCoins = true;

        while (repeatInsertCoins) {
            System.out.println("Please choose and insert the coin.");
            coinStock.keySet().forEach(System.out::println);
            System.out.println("Which coin did you insert? Write a code.");
            int cointCode = inputNumber.nextInt();
            if (coinStock.keySet().stream().anyMatch(coin -> coin.getCod() == cointCode)) {
                Coin currentInsertedCoin = coinStock.keySet().stream().filter(coin -> coin.getCod() == cointCode).findAny().orElse(null);
                if (insertedCoins.keySet().stream().anyMatch(coin -> coin.getCod() == currentInsertedCoin.getCod())) {
                    insertedCoins.replace(currentInsertedCoin, insertedCoins.get(currentInsertedCoin) + 1);
                } else {
                    insertedCoins.put(currentInsertedCoin, 1);
                }
            } else {
                System.out.println("Please select correct code of coin");
            }
            System.out.println("Do you want insert more coins? Yes:No");
            if (inputText.nextLine().toLowerCase().equals("no")) {
                repeatInsertCoins = false;
            }
        }
        return insertedCoins;
    }

    private static int getTotalValueOfAllInsertedCoins(Map<Coin, Integer> insertedCoins) {
        int totalValueOfAllInsertedCoints = 0;
        for (Map.Entry<Coin, Integer> coin : insertedCoins.entrySet()) {
            totalValueOfAllInsertedCoints += (coin.getKey().getValue() * coin.getValue());
        }
        return totalValueOfAllInsertedCoints;
    }
}
