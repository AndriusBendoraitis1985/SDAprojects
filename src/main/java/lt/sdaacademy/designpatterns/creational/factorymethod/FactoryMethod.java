package lt.sdaacademy.designpatterns.creational.factorymethod;

import lt.sdaacademy.designpatterns.creational.factorymethod.example.Pizza;
import lt.sdaacademy.designpatterns.creational.factorymethod.example.PizzaFactory;

public class FactoryMethod {

    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();

        Pizza margharita = factory.getPizza(1);
        Pizza capriciosa = factory.getPizza(2);
        Pizza fruttiDiMare = factory.getPizza(3);

        System.out.println(margharita.getDetectedPizza());
        System.out.println(capriciosa.getDetectedPizza());
        System.out.println(fruttiDiMare.getDetectedPizza());
    }
}
