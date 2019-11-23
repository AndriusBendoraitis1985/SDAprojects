package lt.sdaacademy.fundamentalscoding.practicalexsercises.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);

       // System.out.println("Ivesk pirma skaiciu");
      //  double firstnum = numberScanner.nextDouble();
        double firstnum = getNum2 (numberScanner,"Ivesk pirma skaiciu");

double atsakymas;

        boolean calculate = true;

        while (calculate) {

          //  System.out.println("Ivesk antra skaiciu");
           // double secondnum = numberScanner.nextDouble();

            double secondnum = getNum(numberScanner,"Ivesk antra skaiciu");

            System.out.println("Koki veiksma norite atlikti: + - / *");
            String action = actionScanner.nextLine();

            atsakymas = getAtsakymas(action, firstnum, secondnum);

            System.out.println("gautas rezultatas = " + atsakymas);

            System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");

            String anwser = actionScanner.nextLine();

            System.out.println("Jusu rezultatas is ankstesnio skaiciavimo yra " + atsakymas);

            firstnum = atsakymas;

            if (anwser.toLowerCase().equals("ne")) {
                calculate = false;
            }
        }
    }
    private static double getNum2 (Scanner numberScanner, String message2){
        System.out.println(message2);
        double number2 = numberScanner.nextDouble();
        return number2;
    }


    private static double getNum (Scanner numberScanner, String message){
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }

    private static double getAtsakymas(String action, double num1, double num2) { // tai yra funkcija
        switch (action) {
            case ("+"): {
                return num1 + num2;
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("veiksmas nerastas");
                return (double) 0;
            }
        }

    }
}
