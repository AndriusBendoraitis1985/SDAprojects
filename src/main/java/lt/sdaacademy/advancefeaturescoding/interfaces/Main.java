package lt.sdaacademy.advancefeaturescoding.interfaces;

/*Daugiakampiai:
        Interfeisas RegularPolygon turi 2 metodus getNumSides ir getSideLength
        Klasė EquilateralTriangle, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 3, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Klasė Square, kuri implementuoja interfeisą RegularPolygon metodą getNumSides gražina skaičių 4, metodą getSideLength gražina kintamojo reikšmę, inicializuotą per konstruktorių;
        Interfeise pridėti 2 defaultinius metodus: getPerimeter(n * length) ir getInteriorAngle((n / 2) PI / n)
        Sukurtoje RegularPolygonMain klasėje apskaičiuoti figūrų perimetrus ir plotus.*/

public class Main {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println("Square perimetre is " + square.getPerimeter());
        System.out.println("Square area is " + square.getSideLength() * square.getSideLength());

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(10);

        System.out.println("Triangle perimetre is " + equilateralTriangle.getPerimeter());
        System.out.println("Triangle area is " + (int)Math.pow(equilateralTriangle.getSideLength(),2)/2);

    }

}
