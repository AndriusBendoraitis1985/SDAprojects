package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.service;

import java.util.Scanner;

public class IOservice {

    public static String[] readDataFromScanner() {
        System.out.println("Enter person name, surname and date of born");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] inputData = text.split(" ");
        return inputData;
    }

}
