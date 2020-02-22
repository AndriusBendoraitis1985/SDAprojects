package lt.sdaacademy.designpatterns.creational.singleton.example;

public class Pizza {

    private static  Pizza instance = null;

    public String name;

    private  Pizza (){
        name = "Margharita";
    }

    public static Pizza getInstance(){
        if (instance == null){
            instance = new Pizza();
        } return instance;
    }

    @Override
    public String toString() {
        return "Pizza name=" + name;
    }
}
