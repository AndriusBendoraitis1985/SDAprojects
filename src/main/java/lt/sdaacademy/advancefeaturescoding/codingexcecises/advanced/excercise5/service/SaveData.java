package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.Trip;

public class SaveData {

    private static final String OUTPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise5\\service\\outputFile.json";

    public static void saveDataToJSon(Map<String, List<String>> finalJourney){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Trip trip = new Trip(finalJourney);

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)){

            gson.toJson(trip,writer);

        }catch (IOException e){
            System.out.println("Error while write to Json");
        }

    }
}
