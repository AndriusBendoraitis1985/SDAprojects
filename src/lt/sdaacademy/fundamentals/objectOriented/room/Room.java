package lt.sdaacademy.fundamentals.objectOriented.room;

public class Room {
    private int width;
    private int lenth;

    public Room (int width, int lenth){
        this.width=width;
        this.lenth = lenth;
    }

    public int getWidth() {
        return width;
    }

    public int getLenth() {
        return lenth;
    }
}
