package lt.sdaacademy.designpatterns.behavioral.command.example;

public class QuickSort implements CommandInterface {

    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Quick Sort");
        CommandInterface.printArray(arr, "Before");
        sort(arr, 0, arr.length - 1);
        CommandInterface.printArray(arr, "After");
        System.out.println("Quick Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    public void sort(int[] tab, int start, int end) {
        if (start < end) {
            int pivot = arr[end];
            int i = (start - 1);

            for (int j = start; j < end; j++) {
                if (arr[j] <= pivot) {
                    i++;

                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }

            int swap = arr[i + 1];
            arr[i + 1] = arr[end];
            arr[end] = swap;
            int pivotIndex = i + 1;

            sort(arr, start, pivotIndex - 1);
            sort(arr, pivotIndex + 1, end);
        }
    }
}