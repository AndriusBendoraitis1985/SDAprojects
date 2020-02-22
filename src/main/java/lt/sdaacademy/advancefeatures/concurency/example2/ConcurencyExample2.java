package lt.sdaacademy.advancefeatures.concurency.example2;

import org.apache.log4j.Logger;

public class ConcurencyExample2 {

    private static final Logger logger = Logger.getLogger(ConcurencyExample2.class);

    public static void main (String[] args){
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.start();

        logger.info("Main thread starts");
        try {
            Thread.sleep(2000);
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch (InterruptedException e){
            logger.error("Thread is interrupted on sleep");
        }
    }

}
