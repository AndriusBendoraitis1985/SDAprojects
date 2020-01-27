package lt.sdaacademy.advancefeatures.annotations.custom;

public class CustomAnnotationtest {

    @MyAnnotation(name="Andrius" ,age=34)
    public void sayHello(){

        System.out.println("Hello");
    }
}
