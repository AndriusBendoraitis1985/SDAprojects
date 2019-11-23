package lt.sdaacademy.fundamentalscoding.practicalexsercises.circle;

import java.util.Scanner;

public class CircleMain {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Prasome ivesti spinduli");

        int radius = input.nextInt();
        String color = "Brown";

        Circle circle2 = new Circle(radius, color);

      //  double circleLenth = 2*(Math.PI)*circle2.getRadius();
       // System.out.printf("apskiritimo ilgis yra: %.2f", circleLenth);
        System.out.printf("apskiritimo ilgis yra: %.2f", getCircleLenth(circle2));
        System.out.println();
        System.out.printf("apskiritimo plotas yra: %.2f", getCircleArea(circle2));
    }

    private static double getCircleArea(Circle circle){ // funkcija
        return Math.pow(circle.getRadius(),2)*Math.PI;
    }
    private static double getCircleLenth (Circle circle){ // funkcija
        return 2*(Math.PI)*circle.getRadius();
    }
}
