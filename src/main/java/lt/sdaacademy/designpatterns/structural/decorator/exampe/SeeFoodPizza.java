package lt.sdaacademy.designpatterns.structural.decorator.exampe;

public class SeeFoodPizza extends PizzaDecorator {

    public SeeFoodPizza(Pizza pizza) {
        super (pizza);
        super.addIngredients("See Food");
    }
    @Override
    public void printIngredients(){
        super.printIngredients();
    }
}
