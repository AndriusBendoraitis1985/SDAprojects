package lt.sdaacademy.advancefeaturescoding;

public class Company extends Location {

    private Gadget gadget;

    public Gadget getGadget() {
        return gadget;
    }

    public Company(String name, String address, Gadget gadget) {
        super(name, address);
        this.gadget = gadget;
    }

    @Override
    public String toString() {
        return "Company name= " + name +
                ", address= " + address + ", " + gadget;
    }
}
