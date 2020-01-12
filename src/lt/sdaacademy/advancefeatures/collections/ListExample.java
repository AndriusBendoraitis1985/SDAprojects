package lt.sdaacademy.advancefeatures.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> travelRoute = new ArrayList<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");

        for (String destination: travelRoute) {
            System.out.println("Country " + destination);
        }
    }

}
