package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOService {

    private static final String INPUT_DATA = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise9\\services\\transportInputFile.txt";

    public static List<String[]> readFromFile() {
        List<String[]> mainList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_DATA))){
            String line = br.readLine();

            while (line !=null){
                String [] splittedLine = line.split(", ");
                mainList.add(splittedLine);
                line = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Error while reading file");
        }
        return mainList;
    }
}
