package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise9.transport;

public class Tractor extends CommonData{

    private int maxPullWeight;

    public Tractor(String brand, String model, int price, int maxPullWeight) {
        super(brand, model, price);
        this.maxPullWeight=maxPullWeight;
    }
}
