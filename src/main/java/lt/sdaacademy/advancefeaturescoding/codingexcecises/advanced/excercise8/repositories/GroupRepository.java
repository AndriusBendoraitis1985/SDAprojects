package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Group;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Trainer;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.services.MaximumNumberOfStudentsReached;

public class GroupRepository {

    private static List<Group> groupList = new ArrayList<>();
    private static List<Student> allStudents = StudentsRepository.getStudents();
    private static List<Trainer> allTrainers = TrainerRepositories.getTrainerList();


    static {
        groupList.add(new Group("Beginners", assignTrainer(allTrainers), assingStudentList(allStudents)));
        groupList.add(new Group("Midlevel", assignTrainer(allTrainers), assingStudentList(allStudents)));
        groupList.add(new Group("Seniorlevel", assignTrainer(allTrainers), assingStudentList(allStudents)));
        groupList.add(new Group("Superlevel", assignTrainer(allTrainers), assingStudentList(allStudents)));
    }

    public static List<Group> getGroupList() {
        return groupList;
    }

    public static Trainer assignTrainer(List<Trainer> allTrainers) {
        Random random = new Random();
        int i = random.nextInt(allTrainers.size());
        return allTrainers.get(i);
    }

    private static List<Student> assingStudentList(List<Student> allStudents) {
        List<Student> randomStudentList = new ArrayList<>();
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter amount of studens to be in one group");
            int amountOfstudents = input.nextInt();
            Random random = new Random();
            int i = random.nextInt(15);
            randomStudentList.add(allStudents.get(i));
            for (int j = 1; j < amountOfstudents ; j++) {
                i = random.nextInt(15);
                Student testStudentName = allStudents.get(i);
                if (randomStudentList.stream().noneMatch(student -> student.equals(testStudentName))) {
                    randomStudentList.add(allStudents.get(i));
                } else {
                    j--;
                }
            }
            if (randomStudentList.size()>5){
                throw new MaximumNumberOfStudentsReached("Too many students added to one group");
            }
        } catch (MaximumNumberOfStudentsReached e) {
            System.out.println(e.getMessage());
        }
        return randomStudentList;
    }

}
