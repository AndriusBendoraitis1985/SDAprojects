package lt.sdaacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;
import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");
         boolean allNamesLenthIsGtThan3 = names.stream().allMatch(name -> name.length()>3);
         logger.info(allNamesLenthIsGtThan3);

         boolean thereIsANameWhichLenthIsGtThan3 = names.stream().anyMatch(name -> name.length()>3);
         logger.info(thereIsANameWhichLenthIsGtThan3);


    }
}
