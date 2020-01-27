package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StoreValues <T> {

    private List<T> items;

    public StoreValues() {
        this.items = new ArrayList<>();
    }

    public List<T> getItem() {
        return items;
    }

    public void storeValue (T value){
        items.add(value);
    }
}
