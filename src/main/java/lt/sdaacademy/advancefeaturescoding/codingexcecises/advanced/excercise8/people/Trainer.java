package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people;

import java.time.LocalDate;

public class Trainer extends Person {
    private boolean isAutorised;

    public Trainer(String firstName, String lastName, LocalDate dateOfBirth, boolean isAutorised) {
        super(firstName, lastName, dateOfBirth);
        this.isAutorised = isAutorised;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                getFirstName()+ " ,"+ getLastName()+ " ,"+ getDateOfBirth()+ ", isAutorised= " + isAutorised +
                '}';
    }
}
