package lt.sdaacademy.advancefeatures.intefaces.example1;

public interface Shape {

    double getArea();
    double getPerimeter();

    default void print(){
        System.out.println("Shape is: "+ this);
        System.out.println("Shape is: "+ getClass().getSimpleName());
    }
}
