package lt.sdaacademy.advancefeatures.inheritance.animals;

public class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public Cat (String color, boolean mammal, String voice){
        super(mammal, voice);
        this.color=color;

    }
    @Override
    public String toString() {
        return "My color is " + color + ". My voice is " + voice + ". I am mammal: " + mammal;
    }

}
