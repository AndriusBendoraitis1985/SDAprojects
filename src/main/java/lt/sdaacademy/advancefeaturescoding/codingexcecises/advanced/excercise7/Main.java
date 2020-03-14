package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7;

/*7. Statistics
        Create a file that will contain any text. It can be generated using lorem ipsum library.
        Create statistics of words contained in the text.
        Display the number of occurrences of individual words in the form :
        As above sorted.
        Lorem ipsum, random words libs: https://github.com/mdeanda/lorem

<dependency>
<groupId>com.thedeanda</groupId>
<artifactId>lorem</artifactId>
<version>2.1</version>
</dependency>*/


import java.util.List;
import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services.GenerateWords;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services.Sort;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise7.services.ToJson;

public class Main {

    public static void main(String[] args) {

        List<String> cityList = GenerateWords.getCitiesList();

        Cities cities = new Cities(cityList);

        ToJson.writeDataToJason(cities);

        Map <String, Long> finalMap = Sort.getStatisticMap(cityList);
        for (Map.Entry<String,Long> names: finalMap.entrySet()) {
            String country = names.getKey();
            Long count = names.getValue();
            System.out.printf("%s : %s \n", country, count);
        }
    }


}
