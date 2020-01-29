package lt.sdaacademy.advancefeaturescoding;

public class Courier extends Location{

    private String deliveryDate;

    public Courier(String name, String address, String deliveryDate) {
        super(name, address);
        this.deliveryDate=deliveryDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return ", Courier name= " + name  +
                ", address= " + address +
                ", delivery date= " + deliveryDate;
    }
}
