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
        Map<Product, Integer> selectedProducts = selectProduct(productStock);
        selectedProducts.entrySet().forEach(System.out::println);
        int totalCostOfProducts = getTotalCostOfAllSelectedProducts(selectedProducts);
        Map<Coin, Integer> insertedCoins = getInsertedCoinsMap(totalCostOfProducts, coinStock);

    }

    private static Map<Product, Integer> selectProduct(Map<Product, Integer> productStock) {
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
                mapSelectedProductsHashMap(requestedProduct, selectedProducts);
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

    private static void mapSelectedProductsHashMap(Product product, Map<Product, Integer> selectedProducts) {
        if (selectedProducts.containsKey(product)) {
            selectedProducts.replace(product, (selectedProducts.get(product) + 1));
        }
        if (!selectedProducts.containsKey(product)) {
            selectedProducts.put(product, 1);
        }
    }

    private static int getTotalCostOfAllSelectedProducts(Map<Product, Integer> selectedProducts) {
        return selectedProducts.keySet().stream().mapToInt(Product::getPrice).sum();
    }

    private static Map<Coin, Integer> getInsertedCoinsMap(int totalPrice, Map<Coin, Integer> coinStock) {
        Map<Coin, Integer> insertedCoins = new HashMap<>();
        Scanner inputNumber = new Scanner(System.in);
        int totalValueOfAllInsertedCoints = getTotalValueOfAllInsertedCoins(insertedCoins);
        System.out.printf("\nTotal sum of all products= %s EUR\n", totalPrice);
        System.out.printf("\nTotal sum of inserted coins= %s EUR\n", totalValueOfAllInsertedCoints);
        System.out.println("Please choose and insert the coin.");
        coinStock.keySet().forEach(System.out::println);
        System.out.println("Which coin did you insert? Write a code.");
        int cointCode = inputNumber.nextInt();


        if (coinStock.keySet().stream().anyMatch(coin -> coin.getCod() == cointCode)) {
            Coin curentInsertedcoin = coinStock.keySet().stream().filter(coin -> coin.getCod() == cointCode).findFirst().get();
            if (!coinStock.entrySet().contains(curentInsertedcoin)) {
                insertedCoins.put(curentInsertedcoin, 1);
            }
            if (coinStock.entrySet().contains(curentInsertedcoin)){
                insertedCoins.replace(curentInsertedcoin, (curentInsertedcoin.getValue()+1));
            }
        } else {
            System.out.println("Please select correct code of coin");
            //TODO make while loop for coint insertion
        }
        return insertedCoins;
    }

    private static int getTotalValueOfAllInsertedCoins(Map<Coin, Integer> insertedCoins) {
        int totalValueOfAllInsertedCoints = 0;
        for (Map.Entry<Coin, Integer> coin : insertedCoins.entrySet()) {
            totalValueOfAllInsertedCoints = +coin.getKey().getValue() * coin.getValue();
        }
        return totalValueOfAllInsertedCoints;
    }
}
