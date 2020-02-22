package lt.sdaacademy.designpatterns.behavioral.command;


import lt.sdaacademy.designpatterns.behavioral.command.example.BubbleSort;
import lt.sdaacademy.designpatterns.behavioral.command.example.BucketSort;
import lt.sdaacademy.designpatterns.behavioral.command.example.CommandInterface;
import lt.sdaacademy.designpatterns.behavioral.command.example.Controler;
import lt.sdaacademy.designpatterns.behavioral.command.example.HeapSort;
import lt.sdaacademy.designpatterns.behavioral.command.example.MergeSort;
import lt.sdaacademy.designpatterns.behavioral.command.example.QuickSort;
import lt.sdaacademy.designpatterns.behavioral.command.excercise.ShellSort;

public class Command {

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 20 + 1);
            arr[i] = n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Controler controler = new Controler();
        int[] arr = generateRandomArray(10000);
        CommandInterface bubbleSort = new BubbleSort(arr.clone());
        CommandInterface quickSort = new QuickSort(arr.clone());
        CommandInterface bucketSort = new BucketSort(arr.clone());
        CommandInterface mergeSort = new MergeSort(arr.clone());
        CommandInterface heapSort = new HeapSort(arr.clone());
        CommandInterface shellSort = new ShellSort(arr.clone());

        controler.setCommand(bubbleSort);
        controler.runSort();

        controler.setCommand(quickSort);
        controler.runSort();

        controler.setCommand(bucketSort);
        controler.runSort();

        controler.setCommand(mergeSort);
        controler.runSort();

        controler.setCommand(heapSort);
        controler.runSort();

        controler.setCommand(shellSort);
        controler.runSort();
    }
}
