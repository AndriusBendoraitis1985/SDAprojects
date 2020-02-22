package lt.sdaacademy.advancefeatures.concurency.example3;

import org.apache.log4j.Logger;

public class ConcurencyExample3 {

    private static final Logger logger = Logger.getLogger(ConcurencyExample3.class);

    public static void main (String[] args){
        StopWatchThread stopWatchThread1 = new StopWatchThread("Sw1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("Sw2");
        stopWatchThread1.start();
        stopWatchThread2.start();

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
