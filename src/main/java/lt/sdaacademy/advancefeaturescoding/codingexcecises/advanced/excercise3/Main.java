package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise3;

/*3. Personal information
        Create a file containing any personal data (name, surname, phone number).
        Data of individual persons should be in the following lines.
        Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
        Enter the created objects into ArrayList or Map ().
        Present the obtained data.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String INPUT_DATA_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise3\\inputfile.txt";

    public static void main(String[] args) {

        Persons persons = new Persons(getDataFromFile());
        persons.getPersons().forEach(System.out::println);

    }

    private static List<PersonalData> getDataFromFile() {
        List<PersonalData> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_DATA_FILE))) {
            String line=br.readLine();

            while (line != null) {
                String[] splittedLine= line.split(",");
                persons.add(mapDataToObject(splittedLine));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Klaida");
        } return persons;
    }

    private static PersonalData mapDataToObject(String[] personData){
        return new PersonalData(personData[0], personData[1], personData[2]);
    }
}
