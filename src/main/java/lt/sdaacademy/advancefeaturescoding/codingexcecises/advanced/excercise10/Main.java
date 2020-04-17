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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Coin;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.goods.Product;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.Read;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.VendingMachine;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Read.class);

    public static void main(String[] args) {
        VendingMachine vendingMachineStock = Read.read();
        assert vendingMachineStock != null;
        System.out.println(vendingMachineStock);

        Map<Product, Integer> productStock = vendingMachineStock.getProductStock();
        Map<Coin, Integer> coinStock = vendingMachineStock.getCoinStock();

        Map<Product, Integer> selectedProducts = new HashMap<>();
        getSelectProductMap(productStock, selectedProducts);
        int totalCostOfProducts = getTotalCostOfAllSelectedProducts(selectedProducts);
        System.out.printf("\nProduct cost= %s EUR\n", totalCostOfProducts);
        System.out.println();

        Map<Coin, Integer> insertedCoins = new HashMap<>();
        getInsertedCoinsMap(coinStock, insertedCoins);
        int totalValueOfInsertedCoints = getTotalValueOfAllInsertedCoins(insertedCoins);
        System.out.printf("\nInserted coins value= %s EUR\n", totalValueOfInsertedCoints);
        System.out.println();

        selectedProducts.entrySet().forEach(System.out::println);
        insertedCoins.entrySet().forEach(System.out::println);

        Scanner inputText = new Scanner(System.in);
        if (totalCostOfProducts == totalValueOfInsertedCoints) {
            System.out.println("Inserted coins are sufficient for selected products.\nWhat do you want to do? Proceed:Cancel");
            if (inputText.nextLine().toLowerCase().equals("cancel")) {
                cancelAllOperations(vendingMachineStock, selectedProducts, insertedCoins);
            } else {
                confirmPurchase(vendingMachineStock, selectedProducts, insertedCoins);
                Read.write(vendingMachineStock);
            }
        } else if (totalCostOfProducts > totalValueOfInsertedCoints) {
            boolean addmoney = true;
            while (addmoney) {
                System.out.println("Inserted coins are insufficient for selected products.\nWhat do you want to do? Proceed:Cancel");
                if (inputText.nextLine().toLowerCase().equals("cancel")) {
                    cancelAllOperations(vendingMachineStock, selectedProducts, insertedCoins);
                    addmoney = false;
                } else {
                    getInsertedCoinsMap(coinStock, insertedCoins);
                    totalValueOfInsertedCoints = getTotalValueOfAllInsertedCoins(insertedCoins);
                    if (totalCostOfProducts == totalValueOfInsertedCoints) {
                        confirmPurchase(vendingMachineStock, selectedProducts, insertedCoins);
                        Read.write(vendingMachineStock);
                        addmoney = false;
                    }
                }
            }
        } else {
            System.out.println("Inserted coins are sufficient for selected products.\nWhat do you want to do? Proceed:Cancel");
            if (inputText.nextLine().toLowerCase().equals("cancel")) {
                cancelAllOperations(vendingMachineStock, selectedProducts, insertedCoins);
            } else {
                confirmPurchase(vendingMachineStock, selectedProducts, insertedCoins);
                giveChange(vendingMachineStock, (totalValueOfInsertedCoints - totalCostOfProducts));
                Read.write(vendingMachineStock);
            }
        }

        selectedProducts.entrySet().forEach(System.out::println);
        insertedCoins.entrySet().forEach(System.out::println);
    }

    private static void getSelectProductMap(Map<Product, Integer> productStock, Map<Product, Integer> selectedProducts) {
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
                if (productStock.get(requestedProduct) > 0) {
                    productStock.replace(requestedProduct, (productStock.get(requestedProduct) - 1));
                } else {
                    productStock.replace(requestedProduct, 0);
                    selectedProducts.replace(requestedProduct, (selectedProducts.get(requestedProduct) - 1));
                    logger.error("selected product quantity is Insufficient < 1;\n Value reset = 0");
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
    }

    private static int getTotalCostOfAllSelectedProducts(Map<Product, Integer> selectedProducts) {
        int totalCostOfProducts = 0;
        for (Map.Entry<Product, Integer> product : selectedProducts.entrySet()) {
            totalCostOfProducts += product.getKey().getPrice() * product.getValue();
        }
        return totalCostOfProducts;
    }

    private static void getInsertedCoinsMap(Map<Coin, Integer> coinStock, Map<Coin, Integer> insertedCoins) {
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
    }

    private static int getTotalValueOfAllInsertedCoins(Map<Coin, Integer> insertedCoins) {
        int totalValueOfAllInsertedCoints = 0;
        for (Map.Entry<Coin, Integer> coin : insertedCoins.entrySet()) {
            totalValueOfAllInsertedCoints += (coin.getKey().getValue() * coin.getValue());
        }
        return totalValueOfAllInsertedCoints;
    }

    private static void cancelAllOperations(VendingMachine vendingMachineStock, Map<Product, Integer> selectedProducts, Map<Coin, Integer> insertedCoins) {
        vendingMachineStock = Read.read();
        selectedProducts.clear();
        insertedCoins.clear();
    }

    private static void confirmPurchase(VendingMachine vendingMachineStock, Map<Product, Integer> selectedProducts, Map<Coin, Integer> insertedCoins) {
        selectedProducts.clear();
        putCoinsIntoVendingMachineCoinStock(vendingMachineStock, insertedCoins);
        insertedCoins.clear();
    }

    private static void putCoinsIntoVendingMachineCoinStock(VendingMachine vendingMachineStock, Map<Coin, Integer> insertedCoins) {
        for (Map.Entry<Coin, Integer> coinElement : insertedCoins.entrySet()) {
            if (vendingMachineStock.getCoinStock().keySet().stream().anyMatch(coin -> coin == coinElement.getKey())) {
                vendingMachineStock.getCoinStock().replace(coinElement.getKey(), vendingMachineStock
                        .getCoinStock().get(coinElement.getKey()) + coinElement.getValue());
            }
        }
    }

    private static void giveChange(VendingMachine vendingMachineStock, int change) {
        Map<Coin, Integer> coinByValue = new LinkedHashMap<>();
        vendingMachineStock.getCoinStock().entrySet().stream()
                .sorted(Map.Entry.<Coin, Integer>comparingByValue().reversed())
                .forEachOrdered(coinIntegerEntry -> coinByValue.put(coinIntegerEntry.getKey(), coinIntegerEntry.getValue()));
        while (change > 0) {
            for (Map.Entry<Coin, Integer> coin : coinByValue.entrySet()) {
                if (change % coin.getKey().getValue() == 0 && coin.getValue() != 0) {
                    vendingMachineStock.getCoinStock().replace(coin.getKey(), (vendingMachineStock.getCoinStock().get(coin.getKey()) - 1));
                    coinByValue.replace(coin.getKey(), (coinByValue.get(coin.getKey()) - 1));
                    change -= coin.getKey().getValue();
                }
                if (vendingMachineStock.getCoinStock().get(vendingMachineStock.getCoinStock().keySet().stream().filter(c -> c.getValue()==1))==0){
                    logger.error("not enough coins for change");
                    break;
                }
            }
        }
    }
}
