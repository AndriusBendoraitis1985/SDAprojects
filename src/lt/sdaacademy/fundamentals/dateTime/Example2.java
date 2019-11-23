package lt.sdaacademy.fundamentals.dateTime;


import java.time.LocalDateTime;
import java.time.Month;

public class Example2 {
    public static void main(String[] args) {
     //  LocalDateTime now = LocalDateTime.now(); // laikas dabar is sistemos

        LocalDateTime now = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30); // patys burodome laika
       // LocalDateTime.parse("2015-02-20T06:30:00");

        now = now.plusDays(1);
        now = now.minusHours(2);

        System.out.println(now.getMonth());
        System.out.println(now);

    }
}
