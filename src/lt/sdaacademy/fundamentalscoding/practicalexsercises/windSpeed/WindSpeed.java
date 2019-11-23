package lt.sdaacademy.fundamentalscoding.practicalexsercises.windSpeed;

import java.util.Scanner;

public class WindSpeed {

    private static final double NAUTIC_MYLE = 1.852;
    private static final double BEUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {
        System.out.println("Prašome įvesti vėjo greitį km/h");
        Scanner input = new Scanner(System.in);
        int windspeed = input.nextInt();

        //  System.out.println("Vejo greitis mazgais: " + (int) (windspeed * NAUTIC_MYLE));

        System.out.printf("Vejo greitis mazgais: %.1f", getWindSpeedMazg(windspeed));
        System.out.println();

        // int windspeedbeufort = (int) Math.pow(windspeed / BEUFORT_CONSTANT, 1.5);

       // int windspeedbeufort = getWindSpeedBeufort(windspeed);

/*        if (windspeedbeufort <= 12)
            System.out.println("Vejo greitis Beuforto skaleje:" + windspeedbeufort);
        else {
            System.out.println("Vejo greitis Beuforto skaleje: 12");
        }*/
        System.out.printf("Vejo greitis Beuforto skaleje: %.1f", getWindSpeedBeufort(windspeed));
        System.out.println();

/*        System.out.print("Vejo stirumas: ");
        if (windspeed>2){
            System.out.println("stiprus");
        } else {
            System.out.println("silpnas");
        }*/

        System.out.print("Vejo stirumas: ");

        // System.out.println(windspeed <= 2 ? "silpnas" : "stiprus");
        System.out.println(getWindStrench(windspeed));

    }

    private static double getWindSpeedMazg(int windspeed) {
        return (windspeed * NAUTIC_MYLE);
    }

    private static double getWindSpeedBeufort(int windspeed) {
        double windspeedbeufort = Math.pow(windspeed / BEUFORT_CONSTANT, 1.5);
        if (windspeedbeufort <= 12)
            return windspeedbeufort;
        else {
            return 12;
        }
    }

    private static String getWindStrench(int windspeed) {
        return windspeed <= 2 ? "silpnas" : "stiprus";

    }


}



