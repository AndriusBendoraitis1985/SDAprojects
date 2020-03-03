package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private LocalDate date;

    public Person(String name, String surname, LocalDate date) {
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name= " + name +
                " , surname= " + surname +  " , date= " + date;
    }
}
