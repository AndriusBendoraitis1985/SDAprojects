package lt.sdaacademy.designpatterns.structural.decorator.exampe;

public class HammPizza extends PizzaDecorator {

    public HammPizza(Pizza pizza) {
        super (pizza);
        super.addIngredients("Hamm");
    }
    @Override
    public void printIngredients(){
        super.printIngredients();
    }
}
