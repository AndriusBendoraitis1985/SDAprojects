package lt.sdaacademy.designpatterns.structural.decorator.exampe;

public class MushroomsPizza extends PizzaDecorator {

    public MushroomsPizza(Pizza pizza) {
        super (pizza);
        super.addIngredients("Mushrooms");
    }
    @Override
    public void printIngredients(){
        super.printIngredients();
    }
}

