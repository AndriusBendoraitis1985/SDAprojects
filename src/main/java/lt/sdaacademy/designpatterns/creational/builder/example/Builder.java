package lt.sdaacademy.designpatterns.creational.builder.example;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class Builder {

    public static void main(String[] args) {

        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 32)
                .AddCheese(true)
                .AddSauce(true)
                .TakeAway(true)
                .build();

        Pizza capriciosa = new Pizza.PizzaBuilder("capriciosa", 28)
                .AddSauce(true)
                .build();

        System.out.println(margharita);
        System.out.println(capriciosa);
    }
}
