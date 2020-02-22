package lt.sdaacademy.advancefeatures.concurency.example4;

public class StopWatchThread implements Runnable {

    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Stop watch is: " +" "+ i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
