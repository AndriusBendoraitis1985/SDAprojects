package lt.sdaacademy.algorithmsanddatastructure.algorithms.secondminimalarrayelement;

public class SecondMinElement {
    public static void main(String[] args) {
        int[] arrOriginal = {1, 4, 5, 6, 7, 1, 2};
        int[] sortedArr = getSorterArr(arrOriginal);

        System.out.println("second minimal numer ir array is: " + getSecondMinDigit(sortedArr));
    }

    private static int [] getSorterArr(int[] arrOriginal) {
        for (int i = 0; i <= arrOriginal.length - 1; i++) {
            for (int j = 1; j <= arrOriginal.length - 1 - i; j++) {
                if (arrOriginal[j] < arrOriginal[j - 1]) {
                    int maxTemp = arrOriginal[j];
                    arrOriginal[j] = arrOriginal[j - 1];
                    arrOriginal[j - 1] = maxTemp;
                }
            }
        }return arrOriginal;
    }

    private static int getSecondMinDigit (int[] sortedArr){
        int secondMinDigit=sortedArr[1];
        for (int element:sortedArr) {
            if (element>sortedArr[0]){
                secondMinDigit=element;
                break;
            }
        } return secondMinDigit;
    }
}
