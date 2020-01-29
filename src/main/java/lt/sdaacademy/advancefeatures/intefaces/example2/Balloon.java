package lt.sdaacademy.advancefeatures.intefaces.example2;

import java.util.Random;

public class Balloon extends AirTransport implements Fly {

    public Balloon (int speed){
        super(speed);
    }
    @Override
    public int maxSpeed(){
        return 100 / super.getSpeed()* new Random().nextInt(100);
    }

    @Override
    public boolean canFly (String condition){
        return condition.equals("good");
    }

}
