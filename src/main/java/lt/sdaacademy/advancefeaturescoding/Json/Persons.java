package lt.sdaacademy.advancefeaturescoding.Json;
import java.util.List;

public class Persons {

    private List<PersonData> persons;

    public List<PersonData> getPersons() {
        return persons;
    }

    public Persons (List<PersonData> persons){
        this.persons=persons;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "persons=" + persons +
                '}';
    }
}
