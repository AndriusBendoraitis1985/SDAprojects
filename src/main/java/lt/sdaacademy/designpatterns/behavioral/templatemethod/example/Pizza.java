package lt.sdaacademy.designpatterns.behavioral.templatemethod.example;

public abstract class Pizza {

    public final void bakingPizza(){
        formingDough();
        addIngrediens();
        bakingDough();
        System.out.println("Pizza is baked");
    }

    private void formingDough(){
        System.out.println("Forming Dough");
    }
    protected abstract void addIngrediens();

    private void bakingDough(){
        System.out.println("Baking Dough");
    }
}
