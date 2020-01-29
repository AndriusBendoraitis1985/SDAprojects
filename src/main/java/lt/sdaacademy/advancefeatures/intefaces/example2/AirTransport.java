package lt.sdaacademy.advancefeatures.intefaces.example2;

public abstract class AirTransport {
    private int speed;

    public AirTransport (int speed){
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }
}
