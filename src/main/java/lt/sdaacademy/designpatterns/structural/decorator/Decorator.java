package lt.sdaacademy.designpatterns.structural.decorator;

import lt.sdaacademy.designpatterns.structural.decorator.exampe.BasicPizza;
import lt.sdaacademy.designpatterns.structural.decorator.exampe.HammPizza;
import lt.sdaacademy.designpatterns.structural.decorator.exampe.MushroomsPizza;
import lt.sdaacademy.designpatterns.structural.decorator.exampe.Pizza;
import lt.sdaacademy.designpatterns.structural.decorator.exampe.SeeFoodPizza;

public class Decorator {

    public static void main(String[] args) {

        Pizza pizza = new BasicPizza();
        pizza.printIngredients();

        HammPizza hammPizza = new HammPizza(pizza);
        pizza.printIngredients();

        Pizza mushroomsPizza = new MushroomsPizza(pizza);
        pizza.printIngredients();

        HammPizza hammPizza1 =  new HammPizza(hammPizza);
        hammPizza1.printIngredients();


        Pizza pizza2 = new BasicPizza();
        Pizza seefood = new SeeFoodPizza(pizza2);
        pizza2.printIngredients();

    }
}
