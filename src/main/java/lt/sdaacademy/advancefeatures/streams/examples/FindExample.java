package lt.sdaacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindExample {

    public static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");
        List<String> namesCopy1 = new ArrayList<>(names);
        List<String> namesCopy2 = new ArrayList<>(names.stream().collect(Collectors.toList())) ;

        Optional <String> firstName1 = names.stream().findAny();

        Optional<String> firstName = names.stream().findAny();
        logger.info(String.format("First name is: %s", firstName.orElse("List is empty")));


    }
}
