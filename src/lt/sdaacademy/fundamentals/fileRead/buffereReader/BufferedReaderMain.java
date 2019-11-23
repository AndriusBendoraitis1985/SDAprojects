package lt.sdaacademy.fundamentals.fileRead.buffereReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static lt.sdaacademy.fundamentals.fileRead.Util.FILE_LOCATION;

public class BufferedReaderMain {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))){

            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while (true) {
                line = br.readLine();

                if (line == null) {
                    break;
                }
                stringBuilder.append(line);
            }

 /*           do {
                line = br.readLine();
                stringBuilder.append(line);
            } while (line != null);*/

            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
