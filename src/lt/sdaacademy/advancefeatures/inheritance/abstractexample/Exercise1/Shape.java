package lt.sdaacademy.advancefeatures.inheritance.abstractexample.Exercise1;

public abstract class Shape {
    private String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }
}
