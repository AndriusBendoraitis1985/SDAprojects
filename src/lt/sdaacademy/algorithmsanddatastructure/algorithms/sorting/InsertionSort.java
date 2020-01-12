package lt.sdaacademy.algorithmsanddatastructure.algorithms.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        int[] sortedArr = sort(arr);
        for (int element : sortedArr) {
            System.out.println(element);
        }
    }
    private static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }
}
