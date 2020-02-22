package lt.sdaacademy.advancefeatures.json.toJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lt.sdaacademy.advancefeatures.json.utils.Staff;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class ToJasonExample {

    private static final Logger logger = Logger.getLogger(ToJasonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeatures\\json\\utils\\file1.json";

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Staff staff = Staff.buildStaff();

        //String staffInJson = gson.toJson(staff);
        //logger.info(staffInJson);

        try (FileWriter writer = new FileWriter(INPUT_FILE_LOCATION)){

            gson.toJson(staff, writer);

        }catch (IOException e){
             logger.error("File not found");
        }
    }
}
