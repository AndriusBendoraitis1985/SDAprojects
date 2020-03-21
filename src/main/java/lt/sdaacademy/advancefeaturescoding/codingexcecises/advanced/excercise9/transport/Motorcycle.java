package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public class Motorcycle extends CommonData {
    private int topSpeed;
    private MotorcycleShapeEnumClass motorcycleShape;

    public Motorcycle(String brand, String model, int price, int topSpeed, MotorcycleShapeEnumClass motorcycleShape) {
        super(brand, model, price);
        this.topSpeed=topSpeed;
        this.motorcycleShape =motorcycleShape;
    }
}
