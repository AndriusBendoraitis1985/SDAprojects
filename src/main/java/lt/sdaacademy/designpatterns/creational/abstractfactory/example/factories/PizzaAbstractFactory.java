package lt.sdaacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {

    Pizza create(int size);
}
