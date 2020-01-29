package lt.sdaacademy.advancefeatures.exceptions;

public class NullPointExceptionExample {

    public static void main (String [] args) throws IvykoAritmetineKlaida {
        try{
            String a = null;
            System.out.println(a.charAt(0));
        } catch (NullPointerException e){
            System.out.println("NullPointerException");
            throw new IvykoAritmetineKlaida("Null pointer happened"); // informuoja kitai klaisei, kad buvo klaida velesnej klasej
        }

    }
}
