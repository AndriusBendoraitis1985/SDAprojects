package lt.sdaacademy.fundamentalscoding.practicalexsercises.circle;

public class Circle { //objektas
    private int radius;
    private String color;

    public Circle (int radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
