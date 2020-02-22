package lt.sdaacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Margharita;
import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class MargharitaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new Margharita(size);
    }
}
