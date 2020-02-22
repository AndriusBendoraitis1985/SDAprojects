package lt.sdaacademy.advancefeaturescoding.codingexcecises.warmup.excercise2;

/*2. Duotam sveikų skaičių formato sąrašui atlikti:
        Jei skaičius yra lyginis, tai prieš skaičių parašyti raidę e;
        Jei skaičius yra nelyginis, tai prieš skaičių parašyti raidę o;
        Skaičiai turi būti tarpusavyje atskirti kableliu;
        Pavyzdžiui: (3,44) -> o3,e44.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberExcercise {

    public static void main(String[] args) {

        // List<String> intergers = Arrays.asList("1", "2", "3", "4", "5", "6","7","8");
        List<Integer> intergers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<String> updated = intergers.stream()
                .filter(evenNumber -> evenNumber % 2 != 0)
                .map(number -> number.toString())
                .collect(Collectors.toList());

        updated.stream().forEach(number -> System.out.println(number));

        String updatedIntegers = intergers.stream()
                .map(number -> number % 2 == 0 ? "e" + number : "o" + number)
                .collect(Collectors.joining(","));

        System.out.println(updatedIntegers);
    }
}
