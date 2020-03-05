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

        List<Student> allStudents = StudentsRepository.getStudents();
        List<Trainer> allTrainers = TrainerRepositories.getTrainerList();
        List<Group> groupList = GroupRepository.getGroupList();

        //     allStudents.forEach(System.out::println);
        //   allTrainers.forEach(System.out::println);
        System.out.println("Initial group list with trainers and students: ");
        groupList.forEach(System.out::println);

        List<Group> sortedGroupListByStudentSurnamesByAlphabet = Sort.getSortGroupListByStudentsLastNameByAlphabet(groupList);
        System.out.println("Groups by students last names: ");
        sortedGroupListByStudentSurnamesByAlphabet.forEach(System.out::println);

        Group groupWithMaxStudents = Sort.getGroupWithMaxStudets(groupList);
        System.out.println("Group with max students: "+groupWithMaxStudents);

        List <Student> youngerStudentsThenTwentyfiveFromAllGroups = Sort.getListOfStudentsYoungerThen25(groupList);
        System.out.println("Students younger than 25:");
        youngerStudentsThenTwentyfiveFromAllGroups.forEach(System.out::println);

        System.out.println("Group list by trainers:");
        for (Group group: groupList) {
            System.out.println(group.getName());
            System.out.println(group.getTrainer().getFirstName());
            for (Student student :group.getStudentList()) {
                System.out.println(student.getFirstName());
            }
            System.out.println();
        }

        List <Student> studentsWithpreviousJavaKnoledge = Sort.getStudentsWithpreviousJavaKnoledgeList(groupList);
        System.out.println("Students with previous Java knowledge");
        studentsWithpreviousJavaKnoledge.forEach(System.out::println);

        Group groupWithMaxStudentsAndNoPreviousJavaKnowledge = Sort.getGroupWithoutMaxStudentsAndNoPreviousJavaKnowledge(groupList);
        System.out.println("Grout with max student without Java knowledge: "+groupWithMaxStudentsAndNoPreviousJavaKnowledge);

        List <Group> groupsWithoutYoungerStudentsThen20 = Sort.getGroupsWithoutYoungerStudentsThan20(groupList);
        System.out.println("Groups without students younger than 20:");
        groupsWithoutYoungerStudentsThen20.forEach(System.out::println);



    }
}
