package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport.Vehicle;

public class IOService {

    private static final String INPUT_DATA = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise9\\services\\vehicles.txt";
    private static final String OUTPUT_DATA = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\codingexcecises\\advanced\\excercise9\\services\\";

    public static List<String[]> readFromFile() {
        List<String[]> mainList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_DATA))) {
            String line = br.readLine();

            while (line != null) {
                String[] splittedLine = line.split(", ");
                mainList.add(splittedLine);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
        return mainList;
    }

    public static void saveVehiclesInSeparateFilesByType(List<Vehicle> vehicleList) {
        try (
                BufferedWriter bwCars = new BufferedWriter(new FileWriter(OUTPUT_DATA + "Cars.txt"));
                BufferedWriter bwMotorcycle = new BufferedWriter(new FileWriter(OUTPUT_DATA + "Motorcycles.txt"));
                BufferedWriter bwTractor = new BufferedWriter(new FileWriter(OUTPUT_DATA + "Tractors.txt"))
        ) {
            for (Vehicle vehicle : vehicleList) {
                switch (vehicle.getClass().getSimpleName()) {
                    case "Car":
                        bwCars.write(vehicle.toString());
                        bwCars.newLine();
                        break;
                    case "Motorcycle":
                        bwMotorcycle.write(vehicle.toString());
                        bwMotorcycle.newLine();
                        break;
                    case "Tractor":
                        bwTractor.write(vehicle.toString());
                        bwTractor.newLine();
                        break;
                    default:
                }
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
