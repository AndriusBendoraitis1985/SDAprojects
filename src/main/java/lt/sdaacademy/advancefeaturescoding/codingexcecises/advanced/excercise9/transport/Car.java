package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public class Car extends CommonData{
    private int topSpeed;
    private CarTransmissionEnumClass carTransmission;
    private CarShapeEnumClass carShape;

    public Car(String brand, String model, int price, int topSpeed, CarTransmissionEnumClass carTransmission, CarShapeEnumClass carShape) {
        super(brand, model, price);
        this.topSpeed = topSpeed;
        this.carTransmission = carTransmission;
        this.carShape = carShape;
    }
}
