package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise6.services;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise5.Trip;

public class Read {

    private static final String INPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise5\\service\\outputFile.json";

    public static Map <String, List<String>> readDataFromJson(){
        Map <String, List<String>> journey = new HashMap<>();
        Gson gson = new Gson();
        try (Reader reader = new FileReader(INPUT_FILE)){
            Trip trip = gson.fromJson(reader, Trip.class);
            journey = trip.getCountries();

        }catch (IOException e){
            System.out.println("error while reading file");
        }

        return journey;
    }

}
