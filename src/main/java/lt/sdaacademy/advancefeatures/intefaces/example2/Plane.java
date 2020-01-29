package lt.sdaacademy.advancefeatures.intefaces.example2;

public class Plane extends AirTransport implements Fly{

    public Plane (int speed){
        super(speed);
    }
    @Override
    public int maxSpeed(){
        return super.getSpeed();
    }

    @Override
    public boolean canFly (String condition){
        return false;
    }

}
