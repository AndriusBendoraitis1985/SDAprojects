package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise6;

/*Load created in the previous exercise plan (JSON). Display it.
        Create a simple interaction with a user. Every time, when user will write "next", next city (or country) should be displayed.
        Add a possibility to remove a city/country from the list (user was not able to visit it)*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise6.services.Read;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, List<String>> journey = Read.readDataFromJson();
        Map<String, List<String>> finaJourney = new HashMap<>(journey);

        for (Map.Entry<String, List<String>> trip : journey.entrySet()) {
            String country = trip.getKey();
            List<String> cities = trip.getValue();

            System.out.println(country + " " + cities);
        }
        for (Map.Entry<String, List<String>> trip : journey.entrySet()) {
            String country = trip.getKey();
            List<String> cities = trip.getValue();

            int i = 0;
            boolean repeat = true;
            while (repeat) {
                System.out.println("If you want to view another city of country " + country + ", write 'next'");
                String answerNext = input.nextLine();
                String curentcity = "";
                if (answerNext.equals("next")) {
                    System.out.println(cities.get(i));

                }
                System.out.println("Do you want to remove from your journey city " + cities.get(i) + ", write 'remove'");
                answerNext = input.nextLine();
                if (answerNext.equals("remove")) {
                    finaJourney.remove(country, cities.get(i));
                }
                if (i >= cities.size()-1){
                    System.out.println("All cities from country "+ country + " were viewed");
                    System.out.println("Do you want to remove country " + country + " from your journey , write 'remove'");
                    answerNext = input.nextLine();
                    if (answerNext.equals("remove")){
                        finaJourney.remove(country);
                    }
                    repeat = false;
                }
                i++;
            }
        }
        for (Map.Entry<String, List<String>> trip : finaJourney.entrySet()) {
            String country = trip.getKey();
            List<String> cities = trip.getValue();

            System.out.println(country + " " + cities);
        }
    }
}
//TODO refactor code