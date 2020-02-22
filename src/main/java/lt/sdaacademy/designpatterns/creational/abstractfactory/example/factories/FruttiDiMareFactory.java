package lt.sdaacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Capriciosa;
import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.FruttiDiMare;
import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class FruttiDiMareFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new FruttiDiMare(size);
    }
}
