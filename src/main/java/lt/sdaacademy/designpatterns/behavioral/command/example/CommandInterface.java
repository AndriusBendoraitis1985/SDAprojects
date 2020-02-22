package lt.sdaacademy.designpatterns.behavioral.command.example;

public interface CommandInterface {

    void execute();

    static void printArray(int[] arr, String type) {
        if (arr.length <= 20) {
            System.out.print(type + ": ");
            int n = arr.length;
            System.out.print("[");
            for (int i = 0; i < n; ++i) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }
    }
}
