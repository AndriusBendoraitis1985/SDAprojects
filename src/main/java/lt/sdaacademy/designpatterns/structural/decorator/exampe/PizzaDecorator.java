package lt.sdaacademy.designpatterns.structural.decorator.exampe;

public class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public void addIngredients(String ingredient) {
        this.pizza.addIngredients(ingredient);
    }

    @Override
    public void printIngredients() {
        this.pizza.printIngredients();

    }
}
