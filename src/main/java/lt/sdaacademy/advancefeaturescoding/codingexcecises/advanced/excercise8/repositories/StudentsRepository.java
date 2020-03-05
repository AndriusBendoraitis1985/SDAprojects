package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;

public class StudentsRepository {
    private static List<Student> studentList = new ArrayList<>();

    static {
        String name = "student";
        String surname = "surname:";
        LocalDate localDate = LocalDate.parse("1991-01-01");

        for (int i = 1; i<=15;i++){
            char x = 97;
          studentList.add(new Student(name+i, surname + (char)(x+i), localDate.plusDays(i*500), i % 2 == 0));
        }
    }

    public static  List<Student>getStudents (){
        return studentList;
    }
}
