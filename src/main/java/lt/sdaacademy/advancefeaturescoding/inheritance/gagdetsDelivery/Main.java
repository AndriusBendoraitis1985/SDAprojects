package lt.sdaacademy.advancefeaturescoding.inheritance.gagdetsDelivery;

/*Deliveries:
        * Susikurti 5 objektus: `Company`, `Gadget`, `GadgetType`, `Distributor`, `Person`
        * Privaloma naudoti abstrakčias klases;
        * Person turi talpinti laukus (`name`, `deliveryAddress`, `gadgetType`, `deliverUntil`);
        * Company turi talpinti laukus (`name`, `companyAddress`, `gadget`);
        * Gadget turi talpinti (`gadgetType`, `price`, `distributor`);
        * Distributor turi talpinti (`name`, `deliveredFrom`', `deliveryDate`)
        * GadgetType turi talpinti tipus -> (PHONE, LAPTOP, TV, PERSONAL_COMPUTER, MICRO_CONTROLLER);
        * Duomenys turi būti skaitomi iš failo.
        * Inicializuoti 3 `Person` objektus. Vienas `Person` objektas privalo turėti 1-3 `Gadget` objektus;
        * Atvaizduoti `Company` objektą kuris turi brangiausią `Gadget` objektą;
        * Atvaizduoti kurie žmonės gaus VISAS siuntas laiku;
        * Visa informacija išvedama į result.txt failą.*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String INPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\Data.txt";
    private static final String OUTPUT_FILE = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\main\\java\\lt\\sdaacademy\\advancefeaturescoding\\GadgetResult.ltxt";

    public static void main(String[] args) {
        List<String> mainList = getMainInfoFromFile();
        int amountOfPersons = Integer.parseInt(mainList.get(0));
        int amountOfCompanies = Integer.parseInt(mainList.get(1));
        List<Person> personList = getPersonListFromList(amountOfPersons, mainList);
        List<Company> companyList = getCompanyListFromList(amountOfCompanies, amountOfPersons, mainList);

        Company mostExpensiveGadget = getCompanyWithMostExpensiveGadget (companyList);
        System.out.println("Pats brangiausias Company objektas yra: " + mostExpensiveGadget);

        List<Person> deliveryOnTime = getPersonListWhoWillGetAllGadgetsOnTime (personList, companyList);
        System.out.println("Visas prekes laiku gaus:");

        for (Person person:deliveryOnTime) {
            System.out.println(person.name);
        }

        writeDataToFile(deliveryOnTime, mostExpensiveGadget);
    }

    private static List<String> getMainInfoFromFile(){
        List<String> mainList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE))){
            String line = "";
            while (line != null){
                line = br.readLine();
                if (line == null){
                    break;
                }
                mainList.add(line);
            }
        }catch (IOException e){
            System.out.println("Klaida nuskaitant faila");
        }
        return mainList;
    }

    private static List<Person> getPersonListFromList(int amountOfPersons, List<String> mainList) {
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i<=amountOfPersons; i++) {
            String[] splittedLine = mainList.get(1+i).split(",");
            personList.add(mapPersonDataToObject(splittedLine));
        }
        return personList;
    }

    private static Person mapPersonDataToObject(String[] personData) {
        return new Person(personData[0], personData[1], mapGadgetTypeToList(personData[2]), personData[3]);
    }

    private static List<GadgetType> mapGadgetTypeToList(String gadgetTypeData) {
        List<GadgetType> gadgetTypeList = new ArrayList<>();
        String[] splittedLine = gadgetTypeData.split("-");
        for (String object: splittedLine) {
            gadgetTypeList.add(GadgetType.getEnumByGadgetName(object));
        }
        return gadgetTypeList;
    }

    private static List<Company> getCompanyListFromList (int amountOfCompanies, int amountOfPersons, List<String> mainList){
        List<Company> companyList = new ArrayList<>();
        for (int i = 1; i<=amountOfCompanies; i++) {
            String[] splittedLine = mainList.get(1+amountOfPersons+i).split(",");
            companyList.add(mapCopmanyDataToObject(splittedLine));
        }
        return companyList;
    }

    private static Company mapCopmanyDataToObject (String[] companyData){
        return new Company(companyData[0], companyData[1], mapGadgetToObject(companyData[2],companyData[3],companyData[4],companyData[5],companyData[6]));
    }

    private static Gadget mapGadgetToObject (String gatgetType, String price, String name, String address, String date){
        return new Gadget(GadgetType.getEnumByGadgetName(gatgetType), Integer.parseInt(price), mapCourierToObject(name,address,date));
    }

    private static Courier mapCourierToObject (String name, String address, String date){
        return new Courier(name, address, date);
    }

    private static Company getCompanyWithMostExpensiveGadget (List<Company> companyList){
        Company mostExpensiveCompanyGadget = companyList.get(0);

        int biggestPrice= companyList.get(0).getGadget().getPrice();

        for (int i = 0; i<companyList.size()-1; i++){
            if (biggestPrice<companyList.get(i).getGadget().getPrice()){
                biggestPrice = companyList.get(i).getGadget().getPrice();
                mostExpensiveCompanyGadget = companyList.get(i);
            }
        }  return mostExpensiveCompanyGadget;
    }

    private static List<Person> getPersonListWhoWillGetAllGadgetsOnTime (List<Person> personList, List<Company> companyList){
        List<Person> deliveryOnTime = new ArrayList<>();
        int count = 0;

        for (int i = 0; i<personList.size(); i++){
            for (int j = 0; j<personList.get(i).getGadgetType().size(); j++) {
                for (Company company : companyList) {
                    if (personList.get(i).getGadgetType().get(j).equals(company.getGadget().getGadgetType())) {
                        if (LocalDate.parse(personList.get(i).getDeliveryUntilDate()).compareTo
                                (LocalDate.parse(company.getGadget().getCourier().getDeliveryDate())) > 0) {
                            count++;
                        }
                    }
                }
            }
            if (count==personList.get(i).getGadgetType().size()){
                deliveryOnTime.add(personList.get(i));
            }
            count = 0;
        }
        return deliveryOnTime;
    }

    private static void writeDataToFile (List<Person> deliveryOnTime, Company mostExpensiveGadget){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE))){
            bw.write("Pats brangiausias Company objektas yra: "+ mostExpensiveGadget + "\n");
            bw.write("Visas prekes laiku gaus:\n");
            for (Person person:deliveryOnTime) {
                bw.write((person.name)+"\n");
            }
        }catch (IOException e){
            System.out.println("Klaida irasant i faila");
        }
    }
}
