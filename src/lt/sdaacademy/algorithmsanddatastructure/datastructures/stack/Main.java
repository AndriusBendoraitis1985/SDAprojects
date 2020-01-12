package lt.sdaacademy.algorithmsanddatastructure.datastructures.stack;

/*PEAK - TIK PARODO IR PALIEKA
POP - PAIMA
PUSH - PATALPINA*/

public class Main {
    public static void main (String [] args){
        CustomStack customStack = new CustomStack(5);

        System.out.println("Stack epmpty? - "+ customStack.isEmpty());
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        System.out.println("Stack peak - "+ customStack.peak());
        customStack.pop();
        customStack.push(7);

        while (!customStack.isEmpty()){
            customStack.pop();
        }
        System.out.println("Stack epmpty? - "+ customStack.isEmpty());
    }

}
