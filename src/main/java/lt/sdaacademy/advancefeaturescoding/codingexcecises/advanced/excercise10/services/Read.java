package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.log4j.Logger;

public class Read {

    private static final String INPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise10\\vendingData.json";
    private static final Logger logger = Logger.getLogger(Read.class);

    public static VendingMachine read() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(INPUT_FILE)){
            VendingMachine vendingMachine = gson.fromJson(reader,VendingMachine.class);
            logger.info("data read completed");
            return vendingMachine;


        }catch (IOException e){
            logger.error("error while reading file from json");
            return null;
        }
    }

}
