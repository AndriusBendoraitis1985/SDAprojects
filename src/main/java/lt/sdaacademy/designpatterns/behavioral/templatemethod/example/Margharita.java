package lt.sdaacademy.designpatterns.behavioral.templatemethod.example;

public class Margharita extends Pizza {

    @Override
    protected void addIngrediens() {
        System.out.println("Margharita");
        System.out.println("Add ingredients: Tomato sauce, cheese");
    }
}
