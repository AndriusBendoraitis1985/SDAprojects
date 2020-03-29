package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public class Motorcycle extends Vehicle {
    private int topSpeed;
    private MotorcycleShapeEnumClass motorcycleShape;

    public Motorcycle(String brand, String model, int price, int topSpeed, MotorcycleShapeEnumClass motorcycleShape) {
        super(brand, model, price);
        this.topSpeed=topSpeed;
        this.motorcycleShape =motorcycleShape;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public MotorcycleShapeEnumClass getMotorcycleShape() {
        return motorcycleShape;
    }

    @Override
    public String toString() {
        return  "Motorcycle: "+ super.toString() + " topSpeed= " + topSpeed +
                ", motorcycle shape= " + motorcycleShape;
    }
}
