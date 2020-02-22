package lt.sdaacademy.designpatterns.creational.abstractfactory.example.pizza;

public abstract class Pizza {

    public abstract String getName();

    public abstract int getSize();

    public abstract String getIngrediants();

    @Override
    public String toString(){
        return "Pizza= " + this.getName() + ", Size= "+ getSize() + ", Ingrediants= "+ getIngrediants();
    }
}
