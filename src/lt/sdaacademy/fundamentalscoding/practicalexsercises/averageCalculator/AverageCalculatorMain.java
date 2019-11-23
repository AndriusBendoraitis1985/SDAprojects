package lt.sdaacademy.fundamentalscoding.practicalexsercises.averageCalculator;

import java.util.Arrays;
import java.util.List;

public class AverageCalculatorMain {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 1);
        //integers.add(8); // prideda prie galo
        //integers.remove(8); //ištrina nurodyta nr

        System.out.println(integers);

        int sum = 0;
        double average = 0;

        for (Integer number : integers) {
            //  System.out.println(number);
            sum += number;
        }
        System.out.println(sum);
        average = (double) sum / integers.size();

        System.out.printf("Vidurkis: %.2f", average);
        // %.2f - filtruoja, kiek bus rodoma skaiciu po kablelio
    }
}
