package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise2;

import java.util.List;

public class GenericClass <T>{

    public static <T> T getLastItem(List<T> items){
        return items.get(items.size()-1) ;
    }
}
