package lt.sdaacademy.algorithmsanddatastructure.algorithms.arraydigitsreverse;

public class ArrayDigitsReverse {
    public static void main (String [] args){
        int [] arrOriginal = {1,4,5,6,7,1,2};

        for (int element:reverseArray(arrOriginal)) {
            System.out.println(element);
        }
    }
    private static int [] reverseArray (int [] arrOriginal){
        int arrayLenth = arrOriginal.length-1;

        for (int i = 0; i <=arrayLenth/2; i++){
            int tempDigit = arrOriginal[i];
            arrOriginal[i]=arrOriginal[arrayLenth-i];
            arrOriginal[arrayLenth-i]=tempDigit;
        }
        return arrOriginal;
    }
}