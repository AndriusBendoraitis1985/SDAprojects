package lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza;

public class Margharita extends Pizza{

    private final int size;

    public Margharita (int size){
        this.size = size;
    }

    @Override
    public String getName() {
        return "Margharita";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngrediants() {
        return "Chesse, Tomato Sauce";
    }
}
