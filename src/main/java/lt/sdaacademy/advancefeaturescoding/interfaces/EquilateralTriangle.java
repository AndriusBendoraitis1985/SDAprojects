package lt.sdaacademy.advancefeaturescoding.interfaces;

public class EquilateralTriangle implements  RegularPolygon {

   private int triangleLenth;

   public EquilateralTriangle (int lenth){
       this.triangleLenth=lenth;
   }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return triangleLenth;
    }
}
