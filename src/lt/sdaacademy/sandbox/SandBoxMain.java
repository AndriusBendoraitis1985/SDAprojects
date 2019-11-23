package lt.sdaacademy.sandbox;

import java.util.Arrays;

public class SandBoxMain {

    public static void main(String[] args) {

/*        int sveikasskaicius = 2;
       double skaiciusPerKableli = 3.14;

       System.out.println(Integer.MAX_VALUE);
       System.out.println(Double.MAX_VALUE);

       System.out.println(Integer.MAX_VALUE+1);*/

    /*    int pirmas = 192;
        int antras = 168;
        int trecias = 1;
        int ketvirtas = 10;

        System.out.printf("192, 168, 1, 10");
        System.out.println();

        System.out.printf("%X, %X, %X, %X", pirmas, antras, trecias, ketvirtas);
        System.out.println();

        double doubleNum = 23.546578;
        System.out.printf("%.2f", doubleNum);
*/
        // logic functins

/*        int x = 4;
        int y = 10;

        System.out.println(x == 10 && y <= 5);
        System.out.println(x <= y && y > 5);
        System.out.println(x == 10 || y >= 5);*/

// casts. pats catsinimas yra aprasomas skliaustuose (int)

/*        double y = 89.832;
        int x = (int) y;
        double z = (double) x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

/*        int x = 4;

        System.out.println(x++);
        System.out.println(--x);
        System.out.println(7 % x++);
        System.out.println(x != 4);
        System.out.println(x == 4);*/

/*        String a = "abc";
        String b = new String("abc");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true*/

/*        String h = "Helleo";
        String w = "World!";
        int x = 1234;

        System.out.println(h.charAt(4));
        System.out.println(h.length());
        System.out.println(h.substring(2));
        System.out.println(h.substring(2,4));

        System.out.println(h.replace("ll", "dd"));
        System.out.println(Arrays.toString(h.split("e")));
        System.out.println(Arrays.toString(h.split("e", 3)));*/


/*        String text = h + ", " + w;

        System.out.println(text);*/

/*        String lettersLow = "abc";
        String lettersUp = "DEF";
        System.out.println(getLetters(lettersLow, lettersUp));
        System.out.println(getLetters(lettersUp,lettersLow));*/

/*        int x = 5;
        System.out.println(getNum(x));*/

        /*int x = 1;
        for (int i = 0; i< 5; i++){
            x+=5;
        }
        System.out.println(x);*/

     /*   for (int i = 1; i <= 5; ++i) {
            System.out.println("Outer loop iteration " + i);
            for (int j = 1; j <= 2; ++j) {
                System.out.println("i = " + i + "; j = " + j);
            }
        }*/


        for (int row = 1; row <= 4; row++) {

            for (int collum = 1; collum <= 4; collum++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    /*    private static int getNum(int x) {
            int y = x + 5;
            return y;
        }*/
/*    private static String getLetters(String lettersLow, String lettersUp) {
        String letterFinal = (lettersLow.toUpperCase() + lettersUp.toLowerCase()).toUpperCase();
        return letterFinal;
    }*/

}


