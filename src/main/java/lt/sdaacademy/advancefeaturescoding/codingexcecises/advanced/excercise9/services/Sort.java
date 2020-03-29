package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services;

import java.util.ArrayList;
import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Car;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.CarShapeEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.CarTransmissionEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Motorcycle;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.MotorcycleShapeEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Tractor;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Vehicle;

public class Sort {

    public static List<Vehicle> getTansportList(List<String[]> initialList) {
        List<Vehicle> vehiclesList = new ArrayList<>();
        for (String[] notSortedData : initialList) {
            switch (notSortedData[0].toLowerCase()) {
                case "car":
                    vehiclesList.add(new Car(notSortedData[1], notSortedData[2],
                            Integer.parseInt(notSortedData[3]), Integer.parseInt(notSortedData[4]),
                            getCarTransmission(notSortedData[5].toLowerCase()),
                            getCarShape(notSortedData[6].toLowerCase())));
                    break;
                case "motorcycle":
                    vehiclesList.add(new Motorcycle(notSortedData[1], notSortedData[2],
                            Integer.parseInt(notSortedData[3]), Integer.parseInt(notSortedData[4]),
                            getMotorcycleShape(notSortedData[5].toLowerCase())));
                    break;
                case "tractor":
                    vehiclesList.add(new Tractor(notSortedData[1], notSortedData[2],
                            getTractorPrice(notSortedData[0], notSortedData[3]), Integer.parseInt(notSortedData[4])));
                    break;
                default:
                    System.out.println("Not recognised object " + notSortedData[0]);
            }
        }
        return vehiclesList;
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
    private static CarShapeEnumClass getCarShape(String data) {
        try {
            return CarShapeEnumClass.getCarShapeByShapeName(data);
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
