package lt.sdaacademy.advancefeaturescoding.interfaces;

public class Square implements RegularPolygon {

    private int squareLenth;

    public Square (int lenth){
        this.squareLenth=lenth;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return squareLenth;
    }
}
