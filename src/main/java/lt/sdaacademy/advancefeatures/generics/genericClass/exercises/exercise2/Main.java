package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise2;

/*Susikurti klasę, kuri turi vieną Generic statinį metodą, kurio pagalba
        yra gražinama paskutinė, į ją paduoto sąrašo reikšmė.
        Išmėginti tiek su String tipo, tiek su Integer tipo sąrašais.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<String> strings = Arrays.asList("Jonas", "Petras");
        List<Integer> integers = Arrays.asList(1, 2, 3);


        GenericClass genericClass = new GenericClass();
        System.out.printf("Last member is: %s \n",GenericClass.getLastItem(strings));
        System.out.printf("Last member is: %s",GenericClass.getLastItem(integers));

    }
}
