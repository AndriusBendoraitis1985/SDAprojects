package lt.sdaacademy.designpatterns.structural.decorator.exampe;

import java.util.ArrayList;

public final class BasicPizza implements Pizza{
    ArrayList <String> ingredients;

    public BasicPizza() {
        ingredients =  new ArrayList<>();
        addIngredients("Pizza dough");
        addIngredients("Tomato sauce");
        addIngredients("Cheese");
    }

    @Override
    public void addIngredients(String ingredient) {
        ingredients.add (ingredient);
    }

    @Override
    public void printIngredients() {
        System.out.println("Pizza: "+ String.join(", ", ingredients));
    }
}
