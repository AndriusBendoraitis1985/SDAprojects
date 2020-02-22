package lt.sdaacademy.algorithmsanddatastructure.algorithms.binarysearch;
// rasti ieskoma skaiciu x is masyvo mas

public class BinarySearch {
    public static void main(String[] args) {
        int[] mas = {0, 2, 5, 7, 16, 17, 18, 20, 21};
        int x = 2;
        int a = 0;
        int b = mas.length - 1;

        System.out.println("Requested digit place in array is: " + searchRequestedDigit(x, a, b, mas));
    }

    private static int searchRequestedDigit(int x, int a, int b, int[] mas) {
        int mid;
        while (true) {
            mid = (a + b) / 2;

            if (mas[mid] == x) {
                break;
            } else if ((b - a) == 1) {
                if (mas[a] == x) {
                    mid = a;
                    break;
                }
                if (mas[b] == x) {
                    mid = b;
                    break;
                } else {
                    System.out.println("requested digit was not found");
                    mid = -1;
                    break;
                }
            } else if (mas[mid] < x) {
                a = mid;
            } else if (mas[mid] > x) {
                b = mid;
            }
        }
        return mid;
    }
}
