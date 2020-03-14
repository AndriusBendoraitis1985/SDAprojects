package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sort {

    public static Map <String, Long> getStatisticMap (List<String> cityList){
        Map <String, Long> citiesStatistic = cityList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map <String, Long> finalMap = new LinkedHashMap<>();
        citiesStatistic.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e-> finalMap.put(e.getKey(),e.getValue()));

     return finalMap;
    }
}
