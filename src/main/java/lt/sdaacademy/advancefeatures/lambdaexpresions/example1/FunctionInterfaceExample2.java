package lt.sdaacademy.advancefeatures.lambdaexpresions.example1;


import java.util.function.Function;

public class FunctionInterfaceExample2 {

    public static void main(String[] args) {
        Function<String, Integer> stringLenth = s -> s.length();
        System.out.println(stringLenth.apply("ABCDE"));

        Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",",".");
        System.out.println(replaceCommasWithDots.apply("a,b,c"));
    }
}