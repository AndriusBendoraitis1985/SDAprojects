package lt.sdaacademy.advancefeaturescoding.Json;

public class PersonData {

    private String name;
    private String surname;
    private String phonenumber;

    public String getName() {
        return name;
    }

    public PersonData(String name, String surname, String phonenumber) {
        this.name = name;
        this.surname = surname;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phonenumber='" + phonenumber + '\'';
    }
}
