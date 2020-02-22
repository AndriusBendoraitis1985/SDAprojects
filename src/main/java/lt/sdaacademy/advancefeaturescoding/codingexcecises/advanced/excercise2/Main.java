package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise2;

/*2. Warehouse
        User should be able to: add, display all of the details, update, delete an item
        Use composition and collections (The warehouse has products/items)
        Add possibility to display summaries, like sum of all of the products, their prices.
        *Add possibility to update number of items in a specific way, e.g.: "pliers:30" "scissors:4"*/

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        for (Map.Entry<String, Integer> product : warehouse.getProducts().entrySet()) {
            String name = product.getKey();
            int price = product.getValue();
            System.out.printf("%s:%s \n", name, price);
        }

        System.out.println("Total sum of all products: " + getTotalProductsSum(warehouse.getProducts()) + " eur");

        String requestedName = "Plate";
        int newPrice = 100;

        getUpdatedProducts(warehouse, requestedName, newPrice);

        for (Map.Entry<String, Integer> product1 : warehouse.getProducts().entrySet()) {
            String name = product1.getKey();
            int price = product1.getValue();
            System.out.printf("%s:%s \n", name, price);
        }
    }

    private static void getUpdatedProducts(Warehouse warehouse, String requestedName, int newPrice) {
        if (warehouse.getProducts().containsKey(requestedName)) {
            warehouse.getProducts().replace(requestedName, newPrice);
        }
    }

    private static int getTotalProductsSum(Map<String, Integer> products) {
        int sumOfAllProducts = products.values().stream()
                .mapToInt(product -> product.intValue()).sum();
        return sumOfAllProducts;
    }
}
