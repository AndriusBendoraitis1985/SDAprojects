package lt.sdaacademy.advancefeatures.inheritance.abstractexample.animal;

public class Cat extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public Cat (String color, boolean mammal, String voice){
        super(mammal, voice);
        this.color=color;

    }

}
