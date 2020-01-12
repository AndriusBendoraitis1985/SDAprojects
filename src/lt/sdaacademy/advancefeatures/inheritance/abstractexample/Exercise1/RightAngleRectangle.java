package lt.sdaacademy.advancefeatures.inheritance.abstractexample.Exercise1;

public abstract class RightAngleRectangle extends Shape{
    private int width;
    private int height;

    public RightAngleRectangle(int width, int height, String shape) {
        super(shape);
        this.width=width;
        this.height=height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
