package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise1;

/*Create a simple Generic class, that will give a possibility,
        to store any kind of value within. Add object of type String,
        Integer and Double to array of that Generic type.
        Print all values of the array within a loop.*/

public class Main {

    public static void main(String[] args) {

        StoreValues storeValues = new StoreValues();
        storeValues.storeValue("ABC");
        storeValues.storeValue(2);
        storeValues.storeValue(1.344);

        System.out.println(storeValues.getItem());

        for (Object t : storeValues.getItem()) {
            System.out.println(t);
        }
    }
}

