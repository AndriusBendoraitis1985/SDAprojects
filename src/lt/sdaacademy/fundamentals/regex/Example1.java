package lt.sdaacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as")); //true, .s 2 simboliu tekstas, antras butinai s
        System.out.println(Pattern.matches(".t", "dt")); //true
        System.out.println(Pattern.matches(".d", "odt")); //false
        System.out.println(Pattern.matches(".d", "oodt")); //false
        System.out.println(Pattern.matches("..t", "odt")); //true

        //el.pasto validacija
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)\\.(.+)$");
        Matcher emailMatcher = emailPattern.matcher("a.bendoraitis@gmail.com");
        System.out.println(emailMatcher.matches()); //true

        String atsakymas = emailMatcher.matches() ? "email is OK" : "email is NOt OK";

        System.out.println(atsakymas);

/*        if (emailMatcher.matches()) {
            System.out.println("email is OK");
        } else {
            System.out.println("email is NOT OK");
        }*/


    }
}
