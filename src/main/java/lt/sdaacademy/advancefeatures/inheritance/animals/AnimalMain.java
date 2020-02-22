package lt.sdaacademy.advancefeatures.inheritance.animals;

import java.util.Arrays;
import java.util.List;

public class AnimalMain {

    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
                new Cat("white", true, "miau"),
                new Dog("Terrier", true, "bark"),
                new Dog("Shepherd", true, "bark")
        );

        for (Animal animal: animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.toString());
        }
}
}
