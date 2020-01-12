package lt.sdaacademy.advancefeatures.inheritance.Example2;

public class Car extends Vehicle{

    private String name;

    public Car (int maxSpeed, String name){
        super (maxSpeed);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getParentHiddenField(){
        return maxSpeed;
    }
}

