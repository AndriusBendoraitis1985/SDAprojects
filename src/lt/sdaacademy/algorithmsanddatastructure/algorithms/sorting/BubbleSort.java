package lt.sdaacademy.algorithmsanddatastructure.algorithms.sorting;


public class BubbleSort {
    public static void main (String [] args){
        int [] arr = {5, 2, 7, 9, 4, 6, 2, 4, 105, 8, 9,-5};
        int [] sortedArr = sort(arr);

        for (int element:sortedArr){
            System.out.println(element);
        }
    }
    private static int[] sort (int[] arr){
        int arraylenth = arr.length-1;

        for(int i =0; i<=arraylenth; i++ ){
            for (int j = 1; j<=arraylenth-i; j++){
                if (arr[j-1]>arr[j]){
                    int smallerNum = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=smallerNum;
                }
            }
        }
        return arr;
    }

}
