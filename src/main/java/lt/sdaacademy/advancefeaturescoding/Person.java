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

    @Override
    public String toString() {
        return  "deliveryUntilDate='" + deliveryUntilDate + '\'' +
                ", gadgetType=" + gadgetType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'';
    }
}
