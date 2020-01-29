package lt.sdaacademy.advancefeatures.object;

public class Main {

    public static void main (String [] args){
        Pocket pocket = new Pocket();
        Pocket pocket1 = new Pocket();
        Pocket pocket2 = new Pocket();

        pocket.setMoney(100);
        pocket1.setMoney(5000);
        pocket2.setMoney(2);

        System.out.println(pocket.getMoney());
        System.out.println(pocket1.getMoney());
        System.out.println(pocket2.getMoney());
}
}
