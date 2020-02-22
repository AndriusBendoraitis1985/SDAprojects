package lt.sdaacademy.advancefeatures.concurency.example4;

public class ConcurencyExample4 {

    public static void main(String[] args) {
        Thread stopWatchThread = new Thread(new StopWatchThread());
        stopWatchThread.start();

    }
}
