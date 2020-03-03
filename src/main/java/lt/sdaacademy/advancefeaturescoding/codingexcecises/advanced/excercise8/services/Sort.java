package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Group;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Person;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Student;

public class Sort {

    public static List <Group> getSortGroupListByStudentsLastNameByAlphabet(List<Group> groupList) {
        List <Group> sortedGroupsByStudentSurnames = new ArrayList<>();
        for (Group group: groupList) {
            List <Student> sortedStudentList = group.getStudentList().stream()
                    .sorted(Comparator.comparing(Person::getLastName))
                    .collect(Collectors.toList());
            sortedGroupsByStudentSurnames.add(new Group(group.getName(), group.getTrainer(),sortedStudentList));
        } return sortedGroupsByStudentSurnames;
    }
}
