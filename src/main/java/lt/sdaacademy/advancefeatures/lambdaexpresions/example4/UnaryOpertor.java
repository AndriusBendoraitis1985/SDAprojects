package lt.sdaacademy.advancefeatures.lambdaexpresions.example4;

import java.util.function.UnaryOperator;

public class UnaryOpertor {

    public static void main (String[] args){
        UnaryOperator<Integer> toSquareUnaryOpeator = i -> i*i;
        System.out.println(toSquareUnaryOpeator.apply(5));

    }
}
