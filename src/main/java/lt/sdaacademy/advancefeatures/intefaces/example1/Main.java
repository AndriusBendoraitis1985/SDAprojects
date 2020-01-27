package lt.sdaacademy.advancefeatures.intefaces.example1;

public class Main {

    public static void main (String [] args){
        Rectangle rectangle = new Rectangle(4,5);

        rectangle.print();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getClass().getSimpleName());

    }

}
