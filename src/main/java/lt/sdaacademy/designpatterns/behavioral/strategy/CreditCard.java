package lt.sdaacademy.designpatterns.behavioral.strategy;

public class CreditCard implements PaymentStrategy {

    private String fullName;
    private String cardNumber;
    private String cvv;
    private String dataOfExpiry;

    public CreditCard(String fullName, String cardNumber, String cvv, String dataOfExpiry) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dataOfExpiry = dataOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + amount + "$. paid with credit card");
    }
}
