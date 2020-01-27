package lt.sdaacademy.advancefeatures.generics.genericClass.example1;

public class Car {

    public static void main (String[] args){
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt=new GenericBox<>(car);
    }
}
