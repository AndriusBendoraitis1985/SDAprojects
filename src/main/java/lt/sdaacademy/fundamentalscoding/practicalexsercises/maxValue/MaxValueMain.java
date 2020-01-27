package lt.sdaacademy.fundamentalscoding.practicalexsercises.maxValue;
//UZDUOTIS: Rasti max reiksme is ivestu skaiciu per kableli. pvz: 163,12,13,2

import java.util.Scanner;

public class MaxValueMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("prasome ivesti skaicius per kablli");
        String inputtext = input.nextLine();// ivedame skaicia atskirti kableliu
        String[] numberLine = inputtext.split(","); // skaiciai atskiriami i tekstini masyvasu funkcija .split(",")

        int max = Integer.parseInt(numberLine[0]); //tekstiniai skaiciai paverciami i int tipo su Integer.parseInt(skaicius)
        // ir nulini nari priskiriame int max

        for (int i = 0; i < numberLine.length; i++) { //nurodome, kad cikla suksime, tiek kartu, kokio ilgio yra masyvas
            int number = Integer.parseInt(numberLine[i]); //visi, vienas po kito tekstiniai skaiciai paverciami
            // i int tipo su Integer.parseInt(skaicius)
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maksimali reiksme yra: " + max);

    }

}
