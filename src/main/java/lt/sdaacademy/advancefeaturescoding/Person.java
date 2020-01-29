package lt.sdaacademy.advancefeaturescoding;

import java.util.List;

public class Person extends Location{

    private String deliveryUntilDate;
    private List<GadgetType> gadgetType;

    public Person(String name, String address, List<GadgetType> gadgetType, String deliveryUntilDate) {
        super(name,address);
        this.gadgetType=gadgetType;
        this.deliveryUntilDate = deliveryUntilDate;

    }

    public String getDeliveryUntilDate() {
        return deliveryUntilDate;
    }

    public List<GadgetType> getGadgetType() {
        return gadgetType;
    }

    @Override
    public String toString() {
        return  "Person name= " + name + '\'' +
                ", address=" + address +
                ", gadgetType= " + gadgetType + '\'' +
                ", delivery until= " + deliveryUntilDate + '\'';
    }
}
