package lt.sdaacademy.fundamentalscoding.practicalexsercises.GuessWord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMain {
    //   private static final String FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\GuessWord\\wordData.txt";
    private static final String WORD = "rytas";

    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);

        char[] wordlist = WORD.toCharArray();
        char[] guessWord = replaceLetterToUnderscore(wordlist);

        System.out.println(wordlist);
        System.out.println(guessWord);

        System.out.println("Prasome ivesti zodi arba raide");
        String input = wordScanner.nextLine();
        char[] usersInput= input.toCharArray();
        if (usersInput.length>1){
            if (usersInput.equals(wordlist)){
                System.out.println("zodis atspetas");
            } else {
                System.out.println("Klaida");
            }

        }if (usersInput.length<=1){
            char[] intermediateList = checkTheLetter(wordlist, usersInput);
        }

    }

    private static char[] replaceLetterToUnderscore(char[] wordlist) {
        char[] getGuessWord = new char[wordlist.length];
        for (int i = 0; i < wordlist.length; i++) {
            getGuessWord[i] = '_';
        }
        return getGuessWord;
    }

    private static char[] checkTheLetter (char[] wordlist, char usersInput){
        char[] intermediateList = new char[wordlist.length];
        for (int i=0; i<wordlist.length; i++) {
            if (wordlist[i]=input){

            }

        } return intermediateList;
    }


}
