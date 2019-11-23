package lt.sdaacademy.fundamentals.fileRead.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdaacademy.fundamentals.fileRead.Util.FILE_LOCATION;

public class ScannerMain {
    public static void main (String[] agrs){
        //need to close
        try{
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e){
            System.out.println("KLAIDA");
        }
        //Closes automtically
        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))){
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e){
            System.out.println("KLAIDA");
        }
    }
}
