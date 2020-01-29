package lt.sdaacademy.advancefeatures.generics.genericClass.example1;

import java.math.BigDecimal;

public class Main {

    public static void main (String[] args){
        Car car = new Car();

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
        boxWithCarInIt.setItem(new Car());
        System.out.println(boxWithCarInIt.getItem());

        GenericBox box = new GenericBox();
        box.setItem("bla");
        box.setItem(BigDecimal.valueOf(42));
        System.out.println(box.getItem());
    }
}
