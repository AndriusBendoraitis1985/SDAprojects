package lt.sdaacademy.advancefeatures.inheritance.Example2;

public class ExampleMain {

    public static void main (String [] args){
        Car myCar = new Car(130, "audi");
        System.out.println(myCar.toString());

        Vehicle myCarVehicle = new Car(210, "bmw");

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle.toString());
    }
}
