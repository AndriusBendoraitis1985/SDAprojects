package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import java.util.ArrayList;
import java.util.List;

public class GenerateWords {

    public static List<String> getCitiesList() {
        Lorem lorem = LoremIpsum.getInstance();
        List<String> cityList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cityList.add(lorem.getCountry());
        }
        return cityList;
    }
}
