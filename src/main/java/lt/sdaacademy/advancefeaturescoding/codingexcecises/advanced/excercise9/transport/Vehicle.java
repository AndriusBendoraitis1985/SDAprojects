package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public class Vehicle {

    private String brand;
    private String model;
    private int price;

    public Vehicle(String brand, String model, int price){
        this.brand = brand;
        this.model=model;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "brand= " + brand +  ", model= " + model +  ", price=" + price +",";
    }
}
