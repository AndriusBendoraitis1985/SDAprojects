package lt.sdaacademy.advancefeatures.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapExample {

    public static void main (String [] args){
        Map<String, String> countries = new HashMap<>();

        UUID key = UUID.randomUUID();

        countries.put("Poland", "Warshaw");
        countries.put("Germany", "Berlin");

        for (Map.Entry<String,String>dictionary : countries.entrySet()){
            String country =dictionary.getKey();
            String capital = dictionary.getValue();

            System.out.printf("%s : %s \n", country, capital);
        }

    }
}
