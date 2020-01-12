package lt.sdaacademy.advancefeatures.inheritance.Example1;
//vaikine klase

public class Car extends Vehicle{

    private boolean convertable;

    public Car (int maxSpeed, boolean convertable){
        super (maxSpeed);
        this.convertable=convertable;
    }
    public boolean isConvertable(){
        return convertable;
    }
}
