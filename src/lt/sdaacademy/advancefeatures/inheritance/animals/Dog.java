package lt.sdaacademy.advancefeatures.inheritance.animals;

public class Dog extends Animal{

    private String breed;

    public Dog (String breed, boolean mammal, String voice){
        super (mammal, voice);
        this.breed=breed;
    }
}
