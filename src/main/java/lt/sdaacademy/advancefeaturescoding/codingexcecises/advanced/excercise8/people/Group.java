package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people;

import java.util.List;

public class Group {

    private String name;
    private Trainer trainer;
    private List<Student> studentList;

    public Group(String name, Trainer trainer, List<Student> studentList) {
        this.name = name;
        this.trainer = trainer;
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", studentList=" + studentList +
                '}';
    }
}
