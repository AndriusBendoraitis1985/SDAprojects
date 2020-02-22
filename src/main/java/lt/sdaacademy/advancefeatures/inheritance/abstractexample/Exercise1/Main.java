package lt.sdaacademy.advancefeatures.inheritance.abstractexample.Exercise1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeatures\\inheritance\\abstractexample\\Exercise1\\result.txt";

    public static void main(String[] args) {

        Circle circle = getCircleData();
        Rectangle rectangle = getRectangleData();

        double circleArea = getCircleArea(circle);
        double circleLenth = getCircleLenth(circle);
        int rectangleArea = getRectangleArea(rectangle);
        int triangleArea = getRectangleArea(rectangle) / 2;

        System.out.printf("Askritimo plotas yra %.2f\n", circleArea);
        System.out.printf("Askritimo ilgis yra %.2f\n", circleLenth);

        System.out.println("Staciakampio plotas yra: " + rectangleArea);
        System.out.println("Stataus trikampio plotas yra: " + triangleArea);

        writeToFile(circleArea, circleLenth, rectangleArea, triangleArea);
    }

    private static double getCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    private static double getCircleLenth(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    private static int getRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }

    private static Circle getCircleData() {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.println("iveskite apkritimo ilgi");
        int x = inputNum.nextInt();
        System.out.println("iveskite apkritimo tipa");
        String shape = inputText.nextLine();

        return new Circle(x, shape);
    }

    private static Rectangle getRectangleData() {
        Scanner inputNum = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.println("iveskite staciakampio ilgi");
        int a = inputNum.nextInt();
        System.out.println("iveskite staciakampio ploti");
        int b = inputNum.nextInt();
        System.out.println("iveskite staciakampio tipa");
        String shape = inputText.nextLine();

        return new Rectangle(a, b, shape);
    }
    private static void writeToFile (double circleArea, double circleLenth, int rectagleArea, int triangleArea){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))){
            bw.write(String.format("Askritimo plotas yra %.2f \n",circleArea));
            bw.write(String.format("Askritimo ilgis yra %.2f \n", circleLenth));
            bw.write("Staciakampio plotas yra "+rectagleArea+"\n");
            bw.write("Trikampio plotas yra "+ triangleArea + "\n");
        }catch (IOException e){
            System.out.println("Ivyko klaida rasant duomenis i faila");
        }
    }
}