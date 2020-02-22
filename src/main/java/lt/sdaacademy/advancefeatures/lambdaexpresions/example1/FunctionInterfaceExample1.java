package lt.sdaacademy.advancefeatures.lambdaexpresions.example1;

import java.util.function.Predicate;

public class FunctionInterfaceExample1 {

    public static void  main (String [] args){
        Runnable myRunnambe = ()-> System.out.println("Runing a runnable");
        myRunnambe.run();

        Predicate<String> startWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startWithABCTest.test("ABCDEF"));
    }
}
