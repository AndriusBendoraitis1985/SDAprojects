package lt.sdaacademy.advancefeatures.exceptions;

public class ArithmeticExceptionExample {

    public static void main (String [] args){
        try{
            int a= 30;
            int b = 0;
            int c = a/b;
            System.out.println("Result = "+ c);
        } catch (ArithmeticException e){
            System.out.println("Cant divede a number by 0");
        }finally {
            System.out.println("Executing finally block");
        }
    }
}
