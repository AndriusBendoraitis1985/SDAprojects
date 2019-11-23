package lt.sdaacademy.fundamentals.fileWrite;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {
    // nurodome, kurioje direktorijoje bus saugomas sukurtas failas
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentals\\fileWrite\\result.txt";

    public static void main(String[] args) {
        String text = "Good Morning!";

        writeDataToFile(text);
    }

    private static void writeDataToFile(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(data);
            System.out.println("duomenys sekmingai ikelti i faila");
        } catch (FileNotFoundException e) {
            System.out.println("failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila");
        }
    }
}


