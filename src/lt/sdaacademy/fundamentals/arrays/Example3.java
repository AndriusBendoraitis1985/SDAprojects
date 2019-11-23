package lt.sdaacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        int[] arrayOfInts = {10, 15, 20, 25,30};

        System.out.println(arrayOfInts[0]);
        System.out.println(arrayOfInts[2]);
        System.out.println(arrayOfInts[4]);

        for ( int i = 0; i<arrayOfInts.length; i++){
            System.out.print(arrayOfInts[i] + " ");
        }

        System.out.println();

        for (int i : arrayOfInts) {
            System.out.print(i + " ");
        }

        System.out.println();

        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30);
        integerList.forEach(number->System.out.print(number + " "));

    }
}
