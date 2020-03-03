package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4;

/*
4. Let's buy a vehicle
        Create class Person
Create class Parser
Create interface or an abstract class Vehicle
Create classes Car and Bike, that will implement/inherit Vehicle.
        User will provide all of the details about the Person (buyer) using command-line
        (e.g. "John Smith born 1984-03-24". Provided information will be parsed using Regex within Parser class.
        Parser class should receive char sequence and return an object of type Person or Null if provided details
        will not have required information.
        Created person will then buy a bike and car. Information about what and when was bought should be displayed.
*/

import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.model.Bike;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.model.Car;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.model.Person;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.service.IOservice;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise4.service.Parser;

public class Main {

    public static void main(String[] args) {


        String[] splittedPersonData = IOservice.readDataFromScanner();
        Person person = Parser.createNewPersoObjectFromGivenData(splittedPersonData);
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println(person.toString()+ car.purchaseVehicle());
        System.out.println(person.toString()+ bike.purchaseVehicle());
    }
}
