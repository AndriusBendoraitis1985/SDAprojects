package lt.sdaacademy.advancefeatures.concurency.example5;

public class SeatTakenThread extends Thread {

    private Bench bench;

    public SeatTakenThread (Bench bench){
        this.bench = bench;
    }

    @Override
    public void run(){
 //       bench.takeASeat();
        bench.methodWithSyncedCodeBock();
    }
}
