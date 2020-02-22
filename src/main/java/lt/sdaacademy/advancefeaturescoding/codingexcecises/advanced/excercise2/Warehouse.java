package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise2;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<String, Integer> products;

    public Warehouse() {
        this.products = makeProductsList();
    }
    private static Map<String, Integer> makeProductsList() {
        Map<String, Integer> products = new HashMap<>();
        products.put("Table", 200);
        products.put("Computer", 1500);
        products.put("Plate", 5);
        products.replace("Computer",5000);
        products.remove("Table");
        products.put("Table", 200);
//TODO pakeisti, kad MAP key butu name, o value visas MAP<key,value>
        return products;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}

