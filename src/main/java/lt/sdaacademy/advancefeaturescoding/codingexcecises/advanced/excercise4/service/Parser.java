package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.service;

import java.time.LocalDate;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.model.Person;

public class Parser {

    public static Person createNewPersoObjectFromGivenData(String[] data) {
        if (data.length > 3) {
            return new Person(data[0], data[1], mapToDateObject(data[3]));
        } else {
            return null;
        }
    }

    private static LocalDate mapToDateObject(String data) {
        try {
            LocalDate localDate = LocalDate.parse(data);
            return localDate;
        } catch (Exception e) {
            System.out.println("Bad date format, present date is set");
            return LocalDate.now();
        }
    }

}

