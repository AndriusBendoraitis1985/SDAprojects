package lt.sdaacademy.advancefeatures.generics.genericClass.example1;

public class GenericBox <T> {

    private T item;

    public GenericBox (T item){
        this.item=item;
    }

    public GenericBox() {

    }

    public T getItem(){
        return item;
    }
    public void setItem(T item){
        this.item=item;
    }
}
