package lt.sdaacademy.advancefeatures.optional;

import java.util.Optional;

public class Example1 {

    public static void main (String[] args){

        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("world");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        System.out.println(stringOptional1.isPresent());
        stringOptional2.ifPresent(t -> System.out.println(t));
        stringOptional2.ifPresent(System.out::println);

        String value = stringOptional3.orElse("Hello world");
        System.out.println(value);

    }
}
