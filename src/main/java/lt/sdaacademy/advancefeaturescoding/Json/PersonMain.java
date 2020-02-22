package lt.sdaacademy.advancefeaturescoding.Json;

/*Asmeniniai duomenys:
        Susikurti objektą PersonalData su laukais: name, surname, phone;
        Duomenys turi būti skaitomi iš failo (Json) formatu;
        Duomenys turi būti nuskaityti į ArrayList struktųrą;
        Atsvaizduoti nuskaitytus duomenis ekrane.*/

import com.google.gson.Gson;
import lt.sdaacademy.advancefeatures.json.toJson.ToJasonExample;
import org.apache.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PersonMain {

    private static final Logger logger = Logger.getLogger(ToJasonExample.class);
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\Json\\Input.json";


    public static void main(String[] args) {

        Persons persons = getPersonsFromJson();

        PersonData person1 = persons.getPersons().get(0);
        PersonData person2 = persons.getPersons().get(1);
        PersonData person3 = persons.getPersons().get(2);

        logger.info("pirmojos asmens duomenys "+ person1);
        logger.info("antrojo asmens duomenys "+ person2);
        logger.info("treciojo asmens duomenys "+ person3);
    }

    private static Persons getPersonsFromJson() {
        Persons persons = new Persons(null);

        Gson gson = new Gson();
        try (Reader reader = new FileReader(INPUT_FILE_LOCATION)) {
            persons = gson.fromJson(reader, Persons.class);
            //     System.out.println(persons);
        } catch (IOException e) {
            System.out.println("Klaida");
        }
        return persons;
    }

}
