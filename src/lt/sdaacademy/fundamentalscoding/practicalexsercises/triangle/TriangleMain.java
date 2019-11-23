package lt.sdaacademy.fundamentalscoding.practicalexsercises.triangle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TriangleMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\triangle\\TrianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\triangle\\triangleresult.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();

        calculateTrianglesPerimeter(triangles);

        writeDataToFile(triangles);

    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = "";
            while (line != null) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] splittedLine = line.split(",");
                triangles.add(trianglesDataToObject(splittedLine));
            }
            System.out.println("failas nuskaitytas");
        } catch (
                IOException e) {
            System.out.println("nuskaitant faila ivyko klaida");
        }
        return triangles;
    }

    public static Triangle trianglesDataToObject(String[] triangleData) {
        return new Triangle(
                Integer.parseInt(triangleData[0]),
                Integer.parseInt(triangleData[1]),
                Integer.parseInt(triangleData[2]),
                TriangleType.valueOf(triangleData[3]));
    }

    private static void calculateTrianglesPerimeter(List<Triangle> triangles) {
        for (Triangle t : triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }

    private static void writeDataToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                    bw.write("trikampio tipas: " + t.getTriangleType().getTriangleDescription() + ", perimetras: " + t.getPerimeter() + "\n");
            }
            System.out.println("duomenys irasyti i faila");
        } catch (FileNotFoundException e) {
            System.out.println("Klaida, irasant duomenis i faila");
        } catch (IOException e) {
            System.out.println("Klaida");
        }
    }
}