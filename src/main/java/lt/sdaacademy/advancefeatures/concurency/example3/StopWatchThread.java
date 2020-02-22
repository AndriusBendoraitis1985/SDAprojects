package lt.sdaacademy.advancefeatures.concurency.example3;

public class StopWatchThread extends Thread {

    private String prefix;

    public StopWatchThread(String prefix){
        this.prefix = prefix;
    }

    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println(prefix +" "+ i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
