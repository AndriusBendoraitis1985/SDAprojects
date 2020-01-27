package lt.sdaacademy.fundamentals.arrays;

public class Example1 {
    public static void main(String[] args) {
        int [] masyvas = new int [5];
        //inicializavimas
        masyvas [0]= 10;
        masyvas [1]= 15;
        masyvas [2]= 20;
        masyvas [3]= 25;
        masyvas [4]= 30;

/*        for (int value: masyvas){
            System.out.println(value);
        }*/

        for (int i = 0; i <masyvas.length+1; i ++){
            try {
                System.out.println(masyvas[i]);
            } catch (Exception e){
                System.out.println("Klaida!");
            }


        }


    }
}
