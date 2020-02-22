package lt.sdaacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {

    public static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        //Filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> logger.info(name));

        //Map
        List <Integer> nameLenths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());

        logger.info(nameLenths);

        OptionalDouble averageNameLenthOptional = names.stream()
                .mapToInt(name-> name.length())
                .average();

        logger.info(averageNameLenthOptional.orElse(0));
    }
}
