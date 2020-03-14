package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;

public class StudentsRepository {
    private static List<Student> studentList = new ArrayList<>();

    static {
        Lorem lorem = LoremIpsum.getInstance();
        LocalDate localDate = LocalDate.parse("1991-01-01");

        for (int i = 1; i<=15;i++){
          studentList.add(new Student(lorem.getFirstName(), lorem.getLastName(), localDate.plusDays(i*500), i % 2 == 0));
        }
    }

    public static  List<Student>getStudents (){
        return studentList;
    }
}
