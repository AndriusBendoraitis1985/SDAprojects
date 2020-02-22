package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise3;

import java.util.List;

public class Persons {

    List<PersonalData> persons;

    public Persons(List<PersonalData> persons) {
        this.persons = persons;
    }

    public List<PersonalData> getPersons() {
        return persons;
    }
}
