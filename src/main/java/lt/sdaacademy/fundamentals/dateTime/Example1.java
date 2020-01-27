package lt.sdaacademy.fundamentals.dateTime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Date now = new Date(); // gauti laika pagal pc
        //arba

        System.out.println(now);

        long millis = System.currentTimeMillis();

        System.out.println(millis);

        now = new Date(millis); // gauti laika pagal pc
        // System.out.println(now); // Sun Nov 10 11:23:38 EET 2019

        Calendar cal = Calendar.getInstance(); // gauti laika pagal pc

        //   System.out.println(cal.getTime());

        //    TimeUnit.SECONDS.sleep(5);

        //  System.out.println(cal.getTime());

        Date date = cal.getTime(); // konvertuojame kalendor objekta i data objekta

        System.out.println(date); // Sun Nov 10 11:23:38 EET 2019

        cal.setTime(now); // konvertuojame Date objekta i Clandar objekta

        System.out.println(cal.get(Calendar.YEAR)); //2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //314
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //45

        String dateIntext = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateIntext);
        System.out.println(localDate); //2019-02-18

    }
}
