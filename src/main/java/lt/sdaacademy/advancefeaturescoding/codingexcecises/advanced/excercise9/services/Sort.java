package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Car;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.CarShapeEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.CarTransmissionEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Motorcycle;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.MotorcycleShapeEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Tractor;

public class Sort {

    public static Map<String, Object> getTansportMap(List<String[]> initialList) {
        Map<String, Object> allTransportTypes = new HashMap<>();
        int i = 1;
        int j = 1;
        int k = 1;
        for (String[] notSortedData : initialList) {
            switch (notSortedData[0].toLowerCase()) {
                case "car":
                    allTransportTypes.put(notSortedData[0]+i, new Car(notSortedData[1], notSortedData[2],
                            Integer.parseInt(notSortedData[3]), Integer.parseInt(notSortedData[4]),
                            getCarTransmission(notSortedData[5].toLowerCase()),
                            CarShapeEnumClass.getCarShapeByShapeName(notSortedData[6].toLowerCase())));
                    i++;
                    break;
                case "motorcycle":
                    allTransportTypes.put(notSortedData[0]+j, new Motorcycle(notSortedData[1], notSortedData[2],
                            Integer.parseInt(notSortedData[3]), Integer.parseInt(notSortedData[4]),
                            getMotorcycleShape(notSortedData[5].toLowerCase())));
                    j++;
                    break;
                case "tractor":
                    allTransportTypes.put(notSortedData[0]+k, new Tractor(notSortedData[1], notSortedData[2],
                            getTractorPrice(notSortedData[0], notSortedData[3]), Integer.parseInt(notSortedData[4])));
                    k++;
                    break;
                default:
                    System.out.println("Not recognised object " + notSortedData[0]);
            }
        }
        return allTransportTypes;
    }

    private static CarTransmissionEnumClass getCarTransmission(String data) {
        try {
            return CarTransmissionEnumClass.getCarShapeByShapeName(data);
        } catch (Exception e) {
            return null;
        }
    }

    private static MotorcycleShapeEnumClass getMotorcycleShape(String data) {
        try {
            return MotorcycleShapeEnumClass.getCarShapeByShapeName(data);
        } catch (Exception e) {
            return null;
        }
    }
    private static int getTractorPrice (String name, String price){
        try {
            return Integer.parseInt(price);
        } catch (NumberFormatException e){
            System.out.printf("No price for object %s indicated. Price set 0 \n", name);
            return 0;
        }

    }

}
