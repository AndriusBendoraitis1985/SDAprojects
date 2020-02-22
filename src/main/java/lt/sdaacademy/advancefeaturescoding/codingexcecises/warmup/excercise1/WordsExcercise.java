package lt.sdaacademy.advancefeaturescoding.codingexcecises.warmup.excercise1;

/*1. Duotą tekstino formato sąrašą reikia pakeisti, tokiu, kuris atitiktų sąlygas:
        Visi žodžiai prasidėtų iš mažosios a raidės;
        Žodis turi tik 5 raides;
        Atsakymą įrašyti į Json failą.*/

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsExcercise {

    private static final String OUTPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\warmup\\filteredList.json";

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Tree", "Sun", "Flower", "Yellow", "Green", "Dog", "Cat", "camel","aaaaa", "aassd");

        List<String> result = words.stream()
                .filter(word->word.startsWith("a"))
                .filter(word->word.length()==5)
                .collect(Collectors.toList());

        result.stream().forEach(name-> System.out.println(name));

        Words words1 = new Words(result);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(OUTPUT_FILE)){

            gson.toJson(words1, writer);

        } catch (IOException e){
            System.out.println("Problems with writing to file");
        }


    }
}
