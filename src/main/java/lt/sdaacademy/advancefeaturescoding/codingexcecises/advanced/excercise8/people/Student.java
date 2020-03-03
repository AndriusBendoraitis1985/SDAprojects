package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people;

import java.time.LocalDate;

public class Student extends Person{
    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, dateOfBirth);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Student{" +
                  getFirstName()+ " ,"+ getLastName()+ " ,"+ getDateOfBirth()+ ", hasPreviousJavaKnowledge= " + hasPreviousJavaKnowledge +
                '}';
    }
}
