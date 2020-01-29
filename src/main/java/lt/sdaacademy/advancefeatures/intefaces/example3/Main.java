package lt.sdaacademy.advancefeatures.intefaces.example3;

/*Sukurti interfeisą, kuris turėtų metodą findRicher.  Sukurti dvi klases Person ir Country ,
 bei abstrakčia klasę, kuri jungtų pastarasias. Inicializavus kelis objektus,
 naudojantis findRicherfunkciją, rasti turtingiausią objektą. (edited)*/

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args){
        List<Resident> residentList = new ArrayList<>();

        Resident resident1 = new Country("Jonas", "Lietuva", BigDecimal.valueOf(19));
        Resident resident2 = new Person("Andy", "Belgium", BigDecimal.valueOf(600));
        Resident resident3 = new Person("Mindaugas", "Warsaw", BigDecimal.valueOf(1000));
        residentList.add(resident1);
        residentList.add(resident2);
        residentList.add(resident3);

        BigDecimal maxMoney= BigDecimal.valueOf(0);
        String maxName = "";

        Resident richest = residentList.get(0);

    /*    for(int i =0; i<residentList.size()-1; i++){
            if (richest.findRicher(residentList.get(i+1).money)){
                richest = residentList.get(i+1);
            }
        }*/
    //TODO finish for cycle




        System.out.println(maxName);
        System.out.println(maxMoney);
    }



}
