package lt.sdaacademy.fundamentalscoding.practicalexsercises.workers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkersMain {

    private static final String FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\workers\\workersData.txt";

    public static void main(String[] args) {
        List<Worker> workersList = getWorkersFromFile();

      //  System.out.println(workersList.get(0).getName() + " " + workersList.get(0).getAge());
        System.out.println("Vidutinis darbuotojo uzmokestis: " + findAverageSalary(workersList));
        System.out.println("Vidutinis darbuotojo amzius: " + findAverageAge(workersList));
        System.out.println("Daugiausiai uzdirbantis darbuotojas: " + findMostExpensiveWorker(workersList));
        System.out.println("Jauniausio darbuotojo amzius: " + findYoungestWorkerName(workersList));


    }

    private static List<Worker> getWorkersFromFile() {
        List<Worker> workersList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                line = br.readLine();

                if (line == null) {
                    break;
                }
                String[] splittedLine = line.split(",");
                workersList.add(mapDataToObject(splittedLine));
            }
        } catch (IOException e) {
            System.out.println("KLAIDA");

        }
        return workersList;
    }

    private static Worker mapDataToObject(String[] workerData) {
        return new Worker(workerData[0], Integer.parseInt(workerData[1]), Integer.parseInt(workerData[2]), workerData[3]);
    }

    private static double findAverageSalary(List<Worker> workerList) {
        double sum = 0;
        for (Worker number : workerList) {
            sum = sum + number.getSalary();
        }
        return sum / workerList.size();
    }

    private static double findAverageAge(List<Worker> workerList) {
        double sum = 0;
        for (Worker number : workerList) {
            sum += number.getAge();
        }
        return sum / workerList.size();
    }

    private static String findMostExpensiveWorker(List<Worker> workerList) {
        String maxPaidWorker = workerList.get(0).getName();
        int maxSalary = workerList.get(0).getSalary();
        for (Worker number : workerList) {
            if (maxSalary < number.getSalary()) {
                maxSalary = number.getSalary();
                maxPaidWorker = number.getName();
            }
        }
        return maxPaidWorker;
    }

    private static String findYoungestWorkerName (List<Worker> workerList) {
        String youngestWorkerName = workerList.get(0).getName();
        int minAge = workerList.get(0).getAge();

        for (Worker number: workerList) {
/*            minAge = Math.min(minAge, number.getAge());
            youngestWorkerName = number.getName();*/

            if (minAge>number.getAge()){ //sprendimas su IF
                minAge = number.getAge();
                youngestWorkerName = number.getName();
            }
        }
        return youngestWorkerName;
    }
}
