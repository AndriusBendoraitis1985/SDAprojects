package lt.sdaacademy.designpatterns.creational.abstractfactory;

import lt.sdaacademy.designpatterns.creational.abstractfactory.example.factories.PizzaFactory;
import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class AbstractFactory {

    public static void main (String[] args){

        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 42);
        Pizza fruttiDiMare = PizzaFactory.createPizza("FruttiDiMare", 28);

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttiDiMare);
    }
}
