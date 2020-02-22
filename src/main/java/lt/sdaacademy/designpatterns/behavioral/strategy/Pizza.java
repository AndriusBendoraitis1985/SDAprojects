package lt.sdaacademy.designpatterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {

    private List <Ingredient> ingredients;
    private int amount;

    public Pizza (){
        this.amount=20;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient (Ingredient ingredient){
        this.ingredients.add(ingredient);
    }
    public int calculateTotal(){

        return ingredients.stream()
                .map(ingredients -> ingredients.getPrice())
                .reduce(0, (sum, curentNum) -> curentNum+sum);
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay((amount+calculateTotal()));
    }
}
