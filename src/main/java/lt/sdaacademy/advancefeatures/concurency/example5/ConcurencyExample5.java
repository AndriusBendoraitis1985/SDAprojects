package lt.sdaacademy.advancefeatures.concurency.example5;

public class ConcurencyExample5 {

    public static void main (String [] args){

        Bench bench = new Bench(1);
        SeatTakenThread seatTakenThread1 = new SeatTakenThread(bench);
        SeatTakenThread seatTakenThread2 = new SeatTakenThread(bench);

        seatTakenThread1.start();
        seatTakenThread2.start();

    }
}
