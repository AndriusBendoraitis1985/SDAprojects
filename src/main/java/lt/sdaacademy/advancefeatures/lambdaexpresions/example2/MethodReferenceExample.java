package lt.sdaacademy.advancefeatures.lambdaexpresions.example2;

import java.util.function.Predicate;

public class MethodReferenceExample {

    public static void  main (String[] args){
        Person person = new Person("Harry", "Potter", 12 );
        Predicate<Person> adultPersonTest = Person::isAdult;
        Predicate<Person> adultPersonTest1 = person1 -> person1.isAdult();

        adultPersonTest.test(person);
        System.out.println(adultPersonTest1.test(person));
    }
}
