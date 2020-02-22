package lt.sdaacademy.designpatterns.behavioral.templatemethod.example;

public class Capriciosa extends Pizza {

    @Override
    protected void addIngrediens() {
        System.out.println("Capriciosa");
        System.out.println("Add ingredients: Tomato sauce, cheese, ham, mushrooms");

    }
}
