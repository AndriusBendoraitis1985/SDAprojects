package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise3;

public class PersonalData {

    /*3. Personal information
        Create a file containing any personal data (name, surname, phone number).
        Data of individual persons should be in the following lines.
        Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
        Enter the created objects into ArrayList or Map ().
        Present the obtained data.*/

    private String name;
    private String surname;
    private String phoneNumber;

    public PersonalData(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
