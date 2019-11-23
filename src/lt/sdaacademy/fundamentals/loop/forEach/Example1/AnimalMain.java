package lt.sdaacademy.fundamentals.loop.forEach.Example1;

import lt.sdaacademy.fundamentals.loop.forEach.Example1.Animal;

public class AnimalMain {
    public static void main(String[] args) {

        Animal dog = new Animal("Boss", "kovinis");
        Animal cat = new Animal("Dolly", "Ciau ciau");

        Animal[] animals = {dog, cat};

        for (Animal a : animals) {
            System.out.println(a.getName());
            System.out.println(a.getBreed());
        }
    }
}
