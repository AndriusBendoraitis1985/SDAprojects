package lt.sdaacademy.designpatterns.behavioral.command.example;

public class BubbleSort implements CommandInterface {

    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Bubble Sort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Bubble Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    private void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int greater = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = greater;
                }
            }
        }
    }

}

