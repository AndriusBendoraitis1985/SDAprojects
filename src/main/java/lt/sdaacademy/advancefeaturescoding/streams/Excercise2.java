package lt.sdaacademy.advancefeaturescoding.streams;

/*2. Su esamu žodžių sąrašu atlikite užduotis:
        Sujunkite žodžius į vieną naudodami reduce funkciją;
        Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su map funkcija ir vėl sujunkite į vieną žodį su reduce;
        Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu , (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę o. [Rytas, Lova, Durys, Automobilis, Katinas]*/

import lt.sdaacademy.advancefeatures.streams.examples.MatchExample;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Excercise2 {

    public static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String commonLine = names.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue + element));
        logger.info(commonLine);

        String commonLineWithBigLetters = names.stream()
                .map(name -> name.toUpperCase())
                .reduce("",
                        (currentValue, element) -> (currentValue + element));
        logger.info(commonLineWithBigLetters);

        String commonLineWithSeparation = names.stream()
                .reduce("",
                        (currentValue, element) -> ((currentValue.isEmpty()? "": currentValue + " , ") + element));
        logger.info(commonLineWithSeparation);

        names.stream()
                .filter(name -> name.contains("o"))
                .forEach(name-> logger.info(name));


    }
}
