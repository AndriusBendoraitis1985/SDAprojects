package lt.sdaacademy.advancefeaturescoding.streams;

/*1. Su esamu vardų sąrašu atlikite užduotis:
        Palikite tuos, kurie trumpesni, nei 6 simbolių;
        Palikite tuos, kurie savyje turi raidę e;
        Atspausdinti esamus vardus didžiosiomis raidėmis;
        Jei yra keli variantai, iš surūšiuoto sąrašo pasirinkite paskutinį vardą.
        [Romualdas, Agnė, Elena, Angelė, Laurynas, Karolis, Bronius, Ignė, Meda]*/

import lt.sdaacademy.advancefeatures.streams.examples.MatchExample;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Excercise1 {


    public static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Romualdas", "Agnė", "Elena", "Angelė", "Laurynas", "Karolis", "Bronius", "Ignė", "Meda");

        String updatedName = names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .peek(name -> System.out.println(name.toUpperCase()))
                .sorted(Comparator.reverseOrder())
                .findFirst().orElse("nera duomenu");


       System.out.println(updatedName);

    }
}
