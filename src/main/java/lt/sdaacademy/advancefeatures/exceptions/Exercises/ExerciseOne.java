package lt.sdaacademy.advancefeatures.exceptions.Exercises;

import java.util.Scanner;

public class ExerciseOne {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();

        try{
            int integerNumber = Integer.parseInt(text);
            System.out.println("number = " + integerNumber);
        }catch (Exception e){
            e.printStackTrace();
            try {
                double doubleNumber = Double.parseDouble(text);
                System.out.println("number = " + doubleNumber);
            } catch (Exception a){
                a.printStackTrace();
                System.out.println("Bad input");
            }
        }
    }
}
