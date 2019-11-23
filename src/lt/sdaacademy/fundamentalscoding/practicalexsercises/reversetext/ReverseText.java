package lt.sdaacademy.fundamentalscoding.practicalexsercises.reversetext;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner textscanner = new Scanner(System.in);
        String text;
        String reverseText = "";

        System.out.println("Iveskite teksta");
        text = textscanner.nextLine();

        for (int i = text.length()-1; i>= 0; i--){
            reverseText += text.charAt(i);
        }
        System.out.println(reverseText);

        int x = text.length() - 1;
        while (x >= 0) {
            reverseText = reverseText + text.charAt(x);
            x--;
        }
        System.out.println(reverseText);
    }
}
