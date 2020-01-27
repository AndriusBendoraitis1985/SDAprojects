package lt.sdaacademy.fundamentalscoding.practicalexsercises.factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main (String[] args){
        System.out.println("prasome ivesti skaiciu");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int factorial=1;

/*        for (int i=0; i<x; i++){
           factorial = factorial*(x-i);
            System.out.println(x-i);
        }
        System.out.println(factorial);*/

        for (int i = 1; i<= x; i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
