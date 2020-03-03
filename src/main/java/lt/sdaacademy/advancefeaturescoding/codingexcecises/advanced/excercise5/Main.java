package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5;

/*5. We're planning vacations
        User provides information about the country and cities that he is going to visit.
        You can use a nested while loop to gather information and a HashMap to store it.
        Display the created plan.
        If city occurs on the list twice it should be displayed as "back and forth"
        Store created plan using JSON.*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.service.IOservice;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.service.SaveData;

public class Main {

    public static void main(String[] args) {

        Map<String, List<String>> countries = IOservice.getMapListOfCitiesAndCountriesDefault();
        Map<String, List<String>> finalJourney = new HashMap<>();

        for (Map.Entry<String, List<String>> name : countries.entrySet()) {
            List<String> cities = getCityListWithourDublicates(name.getValue());
            String country = name.getKey();
            finalJourney.put(country,cities);
        }

        SaveData.saveDataToJSon(finalJourney);

        for (Map.Entry<String, List<String>> journey : finalJourney.entrySet()){
            String country = journey.getKey();
            List<String> cities= journey.getValue();

            System.out.printf("%s : %s \n", country, cities);
        }

    }
        private static List<String> getCityListWithourDublicates (List<String> cities){

            List<String> onlyDublicateCities = cities.stream()
                    .filter(city -> cities.stream().filter(x -> x.equals(city)).count() > 1)
                    .distinct()
                    .collect(Collectors.toList());

            List<String> updatesList = cities.stream()
                    .map(city -> onlyDublicateCities.stream().anyMatch(x -> x.equals(city)) ? city.replace(city, city + " back and forth") : city)
                    .distinct()
                    .collect(Collectors.toList());

            updatesList.forEach(System.out::println);

            return updatesList;
    }
}
