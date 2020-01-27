package lt.sdaacademy.advancefeatures.annotations.custom;

import java.lang.reflect.Method;

public class VerifyCustomAnnotationMain {

    public static void main (String [] args){
        try{
            CustomAnnotationtest customAnnotationtest = new CustomAnnotationtest();
            Method method = customAnnotationtest.getClass().getMethod("sayHello");

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.printf("Name is %s and age is %s", myAnnotation.name(), myAnnotation.age());
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
