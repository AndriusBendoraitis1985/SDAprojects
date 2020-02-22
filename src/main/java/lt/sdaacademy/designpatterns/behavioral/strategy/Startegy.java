package lt.sdaacademy.designpatterns.behavioral.strategy;

public class Startegy {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Ingredient ingredient1 = new Ingredient("Cheese", 15);
        Ingredient ingredient2 = new Ingredient("Ham", 20);
        Ingredient ingredient3 = new Ingredient("Mushrooms", 10);

        pizza.addIngredient(ingredient1);
        pizza.addIngredient(ingredient2);
        pizza.addIngredient(ingredient3);

        pizza.pay(new Cash());

        pizza.pay(new CreditCard("Andrius", "23245677", "345", "01/2030"));

    }
}
