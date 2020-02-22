package lt.sdaacademy.advancefeatures.concurency.example6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    // amount of max thread
    static final int MAX_T = 3;

    public static void main (String[] args){
        //create 5 threads
        Runnable r1 = new Task("task1");
        Runnable r2 = new Task("task2");
        Runnable r3 = new Task("task3");
        Runnable r4 = new Task("task4");
        Runnable r5 = new Task("task5");

        // creates a thread pool with MAx_T no of threads as the fixed pool size

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        // passed the Task objects to the pool

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        //pool shutdown
        pool.shutdown();

    }
}
