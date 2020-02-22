package lt.sdaacademy.advancefeaturescoding.concurency.task1;

public class Animal extends Thread implements Runnable {

    private int weight;
    private String name;

    public Animal(int weight) {
        this.weight = weight;

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increaseWeight();

            try {
                Thread.sleep(1000);
                System.out.println(weight);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } System.out.println("Hello, my animal weight is " + Animal.currentThread().getName() + " " + weight);
    }

    private void increaseWeight () {
        weight++;

    }
}
