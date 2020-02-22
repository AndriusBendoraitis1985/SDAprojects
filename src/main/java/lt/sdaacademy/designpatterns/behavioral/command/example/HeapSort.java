package lt.sdaacademy.designpatterns.behavioral.command.example;

public class HeapSort implements CommandInterface {

    private int[] arr;

    public HeapSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void execute() {
        long timestamp = System.currentTimeMillis();
        System.out.println("Heap Sort");
        CommandInterface.printArray(arr, "Before");
        sort();
        CommandInterface.printArray(arr, "After");
        System.out.println("Heap Sort opertation time " + (System.currentTimeMillis() - timestamp) + " ms");
    }

    public void sort() {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int t = arr[i];
            arr[i] = arr[largest];
            arr[largest] = t;

            heapify(arr, n, largest);
        }
    }
}
