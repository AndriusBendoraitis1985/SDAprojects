package lt.sdaacademy.fundamentalscoding.practicalexsercises.reversetext;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();


        System.out.println("Iveskite teksta");
        stringBuilder.append(scanner.nextLine());

        // String reverseText = stringBuilder.reverse().toString();

        System.out.println(stringBuilder.reverse());

    }
}
