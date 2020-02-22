package lt.sdaacademy.designpatterns.behavioral.visitor.example;

public class Car implements Item {

    private String brand;
    private String color;
    private int price;

    public Car(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

    public int getPrice(){
        return price;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}