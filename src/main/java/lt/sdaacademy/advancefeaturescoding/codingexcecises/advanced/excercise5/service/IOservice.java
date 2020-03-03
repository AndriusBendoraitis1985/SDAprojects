package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.City;

public class IOservice {

    public static Map<String, List<City>> getMapListOfCitiesAndCountries() {
        Map<String, List<City>> countries = new HashMap<>();
        Scanner input = new Scanner(System.in);
        boolean repeatCountry = true;
        while (repeatCountry) {
            boolean repeatCity = true;
            System.out.println("Enter country name");
            String countryName = input.nextLine();
            List<City> cityList = new ArrayList<>();

            while (repeatCity) {
                System.out.println("Enter city name");
                String cityName = input.nextLine();
                cityList.add(new City(cityName));
                countries.put(countryName, cityList);
                System.out.println("Do you want to add more cities?");
                String answerCity = input.nextLine();
                if (answerCity.equals("no")) {
                    repeatCity = false;
                }
            }
            System.out.println("Do you want to add more countries?");
            String answerCountry = input.nextLine();
            if (answerCountry.toLowerCase().equals("no")) {
                repeatCountry = false;
            }
        }
        return countries;
    }

    public static Map<String, List<String>> getMapListOfCitiesAndCountriesDefault(){
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("Lietuva", Arrays.asList("Vilnius", "Kaunas", "Kaunas", "Klaipeda", "Siauliai" ));
        countries.put("Latvia", Arrays.asList("Riga", "Riga", "Venspils", "Liepaja"));

        return countries;
    }
}
