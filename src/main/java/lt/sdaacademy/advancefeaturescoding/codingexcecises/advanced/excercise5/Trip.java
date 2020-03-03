package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5;

import java.util.List;
import java.util.Map;

public class Trip {
    private Map<String, List<String>> countries;

    public Trip(Map<String, List<String>> countries) {
        this.countries = countries;
    }

    public Map<String, List<String>> getCountries() {
        return countries;
    }
}
