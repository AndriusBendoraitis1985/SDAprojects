package lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza;

public class FruttiDiMare extends Pizza {

    private final int size;

    public FruttiDiMare (int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "FruttiDiMare";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngrediants() {
        return "Various fruits";
    }
}
