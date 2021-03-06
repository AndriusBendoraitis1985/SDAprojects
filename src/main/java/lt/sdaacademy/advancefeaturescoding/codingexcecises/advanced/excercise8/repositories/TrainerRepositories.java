package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.repositories;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise8.people.Trainer;

public class TrainerRepositories {

    private static List<Trainer> trainerList = new ArrayList<>();

    static {
        Lorem lorum = LoremIpsum.getInstance();

        LocalDate localDate = LocalDate.parse("1991-01-01");

        for (int i = 1; i<=3;i++){
            trainerList.add(new Trainer(lorum.getFirstName(), lorum.getLastName(), localDate.plusDays(i*150), i % 2 == 0));
        }
    }

    public static List<Trainer> getTrainerList() {
        return trainerList;
    }
}
