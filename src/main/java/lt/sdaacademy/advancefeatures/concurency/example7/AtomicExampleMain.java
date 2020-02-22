package lt.sdaacademy.advancefeatures.concurency.example7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicExampleMain {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        AtomicInt atomicInt = new AtomicInt();
        Runnable r1 = atomicInt;
        Runnable r2 = atomicInt;
        Runnable r3 = atomicInt;
        Runnable r4 = atomicInt;
        Runnable r5 = atomicInt;

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

       pool.shutdown();

       if (pool.isShutdown())
        System.out.println("end");
    }
}
