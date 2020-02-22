package lt.sdaacademy.advancefeaturescoding.streams;

/*Using streams, for a given lists:
        - [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
        - [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
        a) Sort the list.
        b) Print only those names, that start with „E” letter.
        c) Print values greater than 30 and lower than 200.
        d) Print names uppercase.
        e) Remove first and last letter, sort and print names.
        f) *Sort backwards by implementing reverse Comparator and using lambda
        expression.*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Excercise4 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");

        names.stream()
                .sorted()
                .filter(name -> name.startsWith("E"))
                .forEach(name -> System.out.println(name));

        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name.toUpperCase()));

        names.stream()
                .map(name -> name.substring(1, name.length() - 1))
                .peek(name-> System.out.println(name))
                .sorted(Comparator.reverseOrder())
                .forEach(name -> System.out.println(name));
    }
}
