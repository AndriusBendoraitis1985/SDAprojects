package lt.sdaacademy.advancefeaturescoding;

public class Gadget {

    private GadgetType gadgetType;
    private int price;
    private Courier courier;

    public Gadget(GadgetType gadgetType, int price, Courier courier) {
        this.gadgetType = gadgetType;
        this.price = price;
        this.courier = courier;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "gadgetType=" + gadgetType +
                ", price=" + price +
                ", courier=" + courier;
    }
}
