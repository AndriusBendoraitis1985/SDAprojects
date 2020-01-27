package lt.sdaacademy.algorithmsanddatastructure.algorithms.greatestcommondivder;

import java.util.Scanner;

public class GreatestCommonDivider {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first digit");
        int a = input.nextInt();
        System.out.println("Enter second digit");
        int b = input.nextInt();

        while (a!=b){ //euclidean algorithm
            if (a<b){
              b = b-a; }
            if (a>b){
                a=a-b; }
        }
        System.out.println(a);
    }
}
