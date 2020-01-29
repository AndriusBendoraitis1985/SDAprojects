package lt.sdaacademy.fundamentals.arrays;

public class Example2 {
    public static void main(String[] args) {
        String [] arrayOfString = new String[2];
        //inicializavimas
        arrayOfString [0]= "Tree";
        arrayOfString [1]= "Forest";

        for (String s: arrayOfString){
            System.out.println(s);
        }

    }
}
