package lt.sdaacademy.advancefeatures.exceptions;

public class ArrayIndexOutOfBoundsEceptionExample {
    public static void main (String [] args){
        try{
            int a[]= new int[5];
            a[6]= 9;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of Bounds");
        }
    }
}
