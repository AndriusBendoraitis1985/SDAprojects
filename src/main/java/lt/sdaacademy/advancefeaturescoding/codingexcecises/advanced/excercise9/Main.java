package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9;

import java.util.List;
import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services.IOService;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services.Sort;

public class Main {
    public static void main(String[] args) {

        List<String []> initialList = IOService.readFromFile();

        Map<String, Object> allTransportTypes = Sort.getTansportMap(initialList);

        for (Map.Entry<String,Object> transport : allTransportTypes.entrySet()){
            System.out.println("Type: "+ transport.getKey() + " Object: " + transport.getValue());
            System.out.println();
        }

    }
}
