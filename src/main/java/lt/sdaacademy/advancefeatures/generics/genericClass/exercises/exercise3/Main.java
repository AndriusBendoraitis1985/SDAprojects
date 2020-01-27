package lt.sdaacademy.advancefeatures.generics.genericClass.exercises.exercise3;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main (String[] args){

        logger.error("Labas rytas!");

        TwoItems<Integer> twoItems1= new TwoItems(63,20); // leidzia sukurti nurodyto tipo duomenis
        TwoItems<String> twoItems2 = new TwoItems("Jonas","Petras");

        System.out.println(twoItems1);
        System.out.println(twoItems2);

        System.out.println(twoItems1.getEntry1()+twoItems1.getEntry2());

    }
}
