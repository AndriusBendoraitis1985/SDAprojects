package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8;

import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Group;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Trainer;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories.GroupRepository;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories.StudentsRepository;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories.TrainerRepositories;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.services.Sort;

public class Main {

    public static void main(String[] args) {

        List <Student> allStudents = StudentsRepository.getStudents();
        List <Trainer> allTrainers = TrainerRepositories.getTrainerList();
        List<Group> groupList = GroupRepository.getGroupList();

   //     allStudents.forEach(System.out::println);
     //   allTrainers.forEach(System.out::println);
        groupList.forEach(System.out::println);

        List<Group> sortedGroupListByStudentSurnamesByAlphabet =  Sort.getSortGroupListByStudentsLastNameByAlphabet(groupList);


    }
}
