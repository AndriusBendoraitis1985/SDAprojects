package lt.sdaacademy.designpatterns.behavioral.strategy;

public class Cash implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount + "$. paid with cash");

    }
}
