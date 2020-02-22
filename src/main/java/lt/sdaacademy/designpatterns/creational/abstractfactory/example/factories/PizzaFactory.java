package lt.sdaacademy.designpatterns.creational.abstractfactory.example.factories;

import lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class PizzaFactory {

    public static Pizza createPizza(String type, int size) {
        Pizza pizza;

        switch (type) {
            case "Margharita":
                pizza = new MargharitaFactory().create(size);
                break;
            case "Capriciosa":
                pizza = new CapriciosaFactory().create(size);
                break;
            case "FruttiDiMare":
                pizza = new FruttiDiMareFactory().create(size);
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
