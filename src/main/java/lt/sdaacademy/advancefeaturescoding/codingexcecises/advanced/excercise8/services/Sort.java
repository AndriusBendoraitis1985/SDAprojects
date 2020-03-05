package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Group;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Person;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;

public class Sort {

    public static List<Group> getSortGroupListByStudentsLastNameByAlphabet(List<Group> groupList) {
        List<Group> sortedGroupsByStudentSurnames = new ArrayList<>();
        for (Group group : groupList) {
            List<Student> sortedStudentList = group.getStudentList().stream()
                    .sorted(Comparator.comparing(Person::getLastName))
                    .collect(Collectors.toList());
            sortedGroupsByStudentSurnames.add(new Group(group.getName(), group.getTrainer(), sortedStudentList));
        }
        return sortedGroupsByStudentSurnames;
    }

    public static Group getGroupWithMaxStudets(List<Group> groupList) {
        return groupList.stream()
                .max(Comparator.comparing(group -> group.getStudentList().size())).get();
    }

    public static List<Student> getListOfStudentsYoungerThen25(List<Group> groupList) {
        LocalDate twentyFiveYearsBeforeNowDate = LocalDate.now().minusYears(25);
        List<Student> youngerStudentsThenTwentyfiveFromAllGroups = new ArrayList<>();
        for (Group group : groupList) {
            group.getStudentList().stream()
                    .filter(student -> student.getDateOfBirth().compareTo(twentyFiveYearsBeforeNowDate)>0)
                    .forEach(youngerStudentsThenTwentyfiveFromAllGroups::add);
        }
        return youngerStudentsThenTwentyfiveFromAllGroups;
    }

    public static List<Student> getStudentsWithpreviousJavaKnoledgeList(List<Group> groupList) {
        List<Student> studensWithpreviousJavaKnoledge = new ArrayList<>();
        for (Group group: groupList) {
            group.getStudentList().stream()
                    .filter(Student::isHasPreviousJavaKnowledge)
                    .forEach(studensWithpreviousJavaKnoledge::add);
        }
        return studensWithpreviousJavaKnoledge;
    }

    public static Group getGroupWithoutMaxStudentsAndNoPreviousJavaKnowledge(List<Group> groupList){
        List <Group> filteredGroupList = new ArrayList<>();

        for (Group group:groupList) {
            List <Student> students = group.getStudentList().stream()
                    .filter(student -> !student.isHasPreviousJavaKnowledge())
                    .collect(Collectors.toList());
            filteredGroupList.add(new Group(group.getName(), group.getTrainer(), students));
        }
        return filteredGroupList.stream()
                .max(Comparator.comparing(group -> group.getStudentList().size())).get();
    }

    public static List <Group> getGroupsWithoutYoungerStudentsThan20(List <Group> groupList){
        LocalDate twentyYearsBeforeNowDate = LocalDate.now().minusYears(20);
        List <Group> groupsWithoutYoungerStudentsThen20 = new ArrayList<>();
        for (Group group:groupList) {
            List <Student> studentYoungerThan20 = group.getStudentList().stream()
                    .filter(student -> student.getDateOfBirth().compareTo(twentyYearsBeforeNowDate)<0)
                    .collect(Collectors.toList());
            groupsWithoutYoungerStudentsThen20.add(new Group(group.getName(), group.getTrainer(), studentYoungerThan20));
        }
        return groupsWithoutYoungerStudentsThen20;
    }
}
