package lt.sdaacademy.advancefeaturescoding.concurency.task1;

/*Create a class implementing the Runnable interface (implementing the run method):
        a) Inside the run method display „Hello!"
        b) Create a class object.
        c) Start the thread receiving the created object as a parameter (new Thread (<object>).start ())
        d) Create several objects, run a separate thread for each of them.
        e) Add the constructor to the created class, that accepts the int value.
        f) For the displayed data inside the run method, add the received value (Hello + value).
        g) Add a method to the class that will modify the int value.
        h) Add a while loop to the run method, inside which it will print the modified int value every few seconds.
        i) Add the ability to disable (gracefully shutdown) the thread. Why shouldn't we just „kill" the thread?*/

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal(2);
        Animal animal2 = new Animal(4);
        Animal animal3 = new Animal(10);

        Thread thread1 = new Thread(animal1, "animal1");
        Thread thread2 = new Thread(animal2, "animal2");
        Thread thread3 = new Thread(animal3, "animal3");


        thread1.start();
        thread2.start();
        thread3.start();

    }

}
