package lt.sdaacademy.fundamentals.controlFlow.ifElse;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        System.out.println("iveskite amziu");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if (age < 18) {
            System.out.println("Tu paauglys");
        } else {
            System.out.println("Tu suauges");

        }
    }
}
