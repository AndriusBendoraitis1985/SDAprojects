package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9;

/*        * Read vehicles.txt and create objects of the proper type;
 * Count the number of cars, motorcycles, tractors;
 * Count how many vehicles of each brand are there;
 * Sort the cars by price;
 * Sort the choppers by top speed;
 * Display each category of vehicles in separate files.*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services.IOService;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services.Sort;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Car;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Motorcycle;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.MotorcycleShapeEnumClass;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Vehicle;

public class Main {
    public static void main(String[] args) {

        List<String[]> initialList = IOService.readFromFile();
        List<Vehicle> vehiclesList = Sort.getTansportList(initialList);
        List<Car> carList = getCarList(vehiclesList);
        List<Motorcycle> motorcycleList = getMotorcycleList(vehiclesList);

        getMapObjectsSortedByAmount(vehiclesList);

        getBrandsAmoutMapOfAllVehilesList(vehiclesList);

        sortCarListByPrice(carList);

        sortChoppersByTopSpeed(motorcycleList);

        IOService.saveVehiclesInSeparateFilesByType(vehiclesList);
    }

    private static List<Car> getCarList(List<Vehicle> vehiclesList) {
        List<Car> carList = new ArrayList(vehiclesList.stream()
                .filter(vehicle -> vehicle.getClass().getSimpleName().equals("Car"))
                .collect(Collectors.toList()));

        return carList;
    }

    private static List<Motorcycle> getMotorcycleList(List<Vehicle> vehicleList) {
        List<Motorcycle> motorcycleList = new ArrayList(vehicleList.stream()
                .filter(vehicle -> vehicle.getClass().getSimpleName().equals("Motorcycle"))
                .collect(Collectors.toList()));
        return motorcycleList;
    }

    private static void sortCarListByPrice(List<Car> carList) {
        System.out.println("\nCar list sorted by price: ");
        carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void sortChoppersByTopSpeed(List<Motorcycle> motorcycleList) {
        System.out.println("\nChopper list sorted by top speed:");
        motorcycleList.stream()
                .sorted(Comparator.comparing(Motorcycle::getTopSpeed))
                .filter(motorcycle -> motorcycle.getMotorcycleShape().equals(MotorcycleShapeEnumClass.Chopper))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void getMapObjectsSortedByAmount(List<Vehicle> vehiclesList) {
        System.out.println("\nVehicles sorted by amoput:");
        Map<String, Long> vehicleNamesByAmount = vehiclesList.stream()
                .map(Vehicle -> Vehicle.getClass().getSimpleName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> vehicle : vehicleNamesByAmount.entrySet()) {
            System.out.printf("Object: %s, amount: %s \n", vehicle.getKey(), vehicle.getValue());
        }
    }

    private static void getBrandsAmoutMapOfAllVehilesList(List<Vehicle> vehiclesList) {
        System.out.println("\nBrands sorted by amount:");
        Map<String, Long> brandsAmountMap = vehiclesList.stream()
                .map(Vehicle::getBrand)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> groupBrandMapByAmount = new LinkedHashMap<>();
        brandsAmountMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> groupBrandMapByAmount.put(e.getKey(), e.getValue()));

        for (Map.Entry<String, Long> brand : groupBrandMapByAmount.entrySet()) {
            System.out.printf("Brand: %s, amount: %s \n", brand.getKey(), brand.getValue());
        }
    }
}

