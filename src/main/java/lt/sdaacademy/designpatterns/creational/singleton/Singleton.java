package lt.sdaacademy.designpatterns.creational.singleton;

import lt.sdaacademy.designpatterns.creational.singleton.example.Pizza;

public class Singleton {

    public static void main(String[] args) {
        Pizza margharita = Pizza.getInstance();
        margharita.name = "Margharita";

        System.out.println(margharita);

        Pizza capriciosa = Pizza.getInstance();
        margharita.name = "Capriciosa";

        System.out.println(capriciosa);

        Pizza fruttidimari = Pizza.getInstance();
        margharita.name = "Frutti Di Mari";

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttidimari);
    }
}
