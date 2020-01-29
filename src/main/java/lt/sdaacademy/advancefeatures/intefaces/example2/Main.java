package lt.sdaacademy.advancefeatures.intefaces.example2;

public class Main {

    public static void main (String[] args){
        Balloon balloon = new Balloon(56);
        Plane plane = new Plane(880);

        System.out.println(balloon.getSpeed());
        System.out.println(balloon.maxSpeed());
        System.out.println(plane.maxSpeed());
        System.out.println(plane.canFly("fast"));
        System.out.println(balloon.canFly("good"));

    }
}
