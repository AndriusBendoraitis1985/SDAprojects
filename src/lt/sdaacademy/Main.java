package lt.sdaacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println(factorial(x));
    }

    private static int factorial(int num) {
//BASE CASES: 0! = 1 and factorial not defined for negative ints
        if (num < 0) return -1;
        if (num == 0) return 1;
        if (num <= 2) return num; //RECURSIVE STEP: n! = n * (n-1)!
        return (num * factorial(num - 1));
    }
}