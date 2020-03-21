package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public abstract class CommonData {

    private String brand;
    private String model;
    private int price;

    public CommonData (String brand, String model, int price){
        this.brand = brand;
        this.model=model;
        this.price=price;
    }

}
