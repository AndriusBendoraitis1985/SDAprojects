package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.Cities;

public class ToJson {

    private static final String OUTPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise7\\services\\output.json";

    public static void writeDataToJason (Cities cities){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)){
            gson.toJson(cities, writer);
        } catch (IOException e){
            System.out.println("Error while writing into file");
        }


    }
}
