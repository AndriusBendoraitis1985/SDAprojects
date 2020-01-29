package lt.sdaacademy.advancefeatures.inheritance.Example1;
//paveldimumas = polimorfizmas
public class ExampleMain {

    public static void main (String [] args){
        Car myCar = new Car(130, false);
        Vehicle myCarVehicle = new Car(210, true);

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle.toString());
        System.out.println(myCar.toString());
        System.out.println(myCarVehicle.toString());
    }
}
