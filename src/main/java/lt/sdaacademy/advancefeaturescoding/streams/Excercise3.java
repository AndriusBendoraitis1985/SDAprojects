package lt.sdaacademy.advancefeaturescoding.streams;

/*3. Skaičiai:
        Prieš atliekant užduotis susigeneruokite ilgą atsitiktinių skaičių masyvą, sudarytą tik iš 0 ir 1;
        Apskaičiuokite viso masyvo skaitmenų sumą ir ištraukite šaknį.*/

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Random;

public class Excercise3 {

    public static void main (String[] args){

        Random random = new Random();

        System.out.print(Math.sqrt(random.ints(20,0,2).sum()));

    }
}
