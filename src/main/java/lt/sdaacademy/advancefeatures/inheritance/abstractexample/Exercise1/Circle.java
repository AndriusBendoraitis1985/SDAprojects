package lt.sdaacademy.advancefeatures.inheritance.abstractexample.Exercise1;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius, String shape) {
        super(shape);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
