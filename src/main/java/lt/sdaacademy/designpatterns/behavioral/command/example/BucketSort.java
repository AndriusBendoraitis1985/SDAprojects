package lt.sdaacademy.designpatterns.behavioral.command.example;

import static lt.sdaacademy.designpatterns.behavioral.command.example.CommandInterface.*;

public class BucketSort implements CommandInterface {

    private int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Bucket Sort");
        printArray(arr, "Before");
        sort();
        printArray(arr, "After");
        System.out.println("Bucket Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    public void sort() {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                arr[outPos++] = i;
            }
        }
    }

}
