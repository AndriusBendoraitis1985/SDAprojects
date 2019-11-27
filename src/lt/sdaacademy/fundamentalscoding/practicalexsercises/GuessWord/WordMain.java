package lt.sdaacademy.fundamentalscoding.practicalexsercises.GuessWord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WordMain {
    private static final String FILE_LOCATION = "C:\\Users\\Vartotojas\\IdeaProjects\\AntraPamoka\\src\\lt\\sdaacademy\\fundamentalscoding\\practicalexsercises\\GuessWord\\wordData.txt";

    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);

        char[] wordlist = getWordFromFile();
        char[] guessWord = replaceLetterToUnderscore(wordlist);

        char[] intermediateList = {};
        int count = 1;

        while (true) {
            if (Arrays.equals(intermediateList, wordlist)) {
                System.out.println("Sveikinu, žodis atspėtas");
                break;
            }
            System.out.println("Prašome įvesti žodį arba raidę");
            String input = wordScanner.nextLine();
            char[] usersInput = input.toLowerCase().toCharArray();

            if (Arrays.equals(usersInput, wordlist)) {
                System.out.println("Sveikinu, žodis atspėtas");
                break;
            } else if (usersInput.length <= 1) {
                intermediateList = checkTheLetter(wordlist, usersInput, guessWord);
                System.out.println(intermediateList);
                guessWord = intermediateList;
            }
            count++;
        }
        System.out.printf("Žodis atspėtas iš %s spėjimų ", count);
    }

    private static char[] getWordFromFile() {
        char[] wordlist = {};

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();
            wordlist = line.toCharArray();
        } catch (IOException e) {
            System.out.println("Klaida");
        }return wordlist;
    }

    private static char[] replaceLetterToUnderscore(char[] wordlist) {
        char[] getGuessWord = new char[wordlist.length];
        for (int i = 0; i < wordlist.length; i++) {
            getGuessWord[i] = '_';
        }
        return getGuessWord;
    }

    private static char[] checkTheLetter(char[] wordlist, char[] usersInput, char[] guessWord) {
        char[] intermediateList = new char[wordlist.length];
        for (int i = 0; i < wordlist.length; i++) {
            if (wordlist[i] != usersInput[0]) {
                intermediateList[i] = guessWord[i];
            }
            if (wordlist[i] == usersInput[0]) {
                intermediateList[i] = usersInput[0];
            }
        }
        return intermediateList;
    }
}
