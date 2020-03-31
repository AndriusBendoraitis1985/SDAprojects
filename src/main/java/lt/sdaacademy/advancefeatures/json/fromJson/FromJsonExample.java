package lt.sdaacademy.advancefeatures.json.fromJson;

import com.google.gson.Gson;
import lt.sdaacademy.advancefeatures.json.utils.Staff;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class FromJsonExample {

    private static final Logger logger = Logger.getLogger(FromJsonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeatures\\json\\utils\\file1.json";

    public static void main(String[] args) {

        Gson gson = new Gson();
        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

            logger.info("Data was read succesfully");
        } catch (IOException e) {
            logger.error("Error occured while reading file");
        }


    }
}
