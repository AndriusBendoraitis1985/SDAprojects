package lt.sdaacademy.advancefeaturescoding.interfaces;

import static java.lang.Math.PI;

public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    default int getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        return ((getNumSides() / 2) * PI / getNumSides());
    }
}
