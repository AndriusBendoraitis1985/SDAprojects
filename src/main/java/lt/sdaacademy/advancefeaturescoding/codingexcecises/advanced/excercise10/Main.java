package lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10;

/*Implement a traditional vending machine which:
        * Allow user to select products - the menu is displayed in console.
        * Allow user to select what coins to insert - menu is displayed in console.
        * Allow user to take refund by canceling the request.
        * Return selected product and remaining change if any.
        * The state of the vending machine is saved in a file on the disk - a json file.
        * Vending Machine has the product menu configurable - new products can be added in the json file.
        * Vending Machine is configurable on what coins it accepts - new coins can be added in the json file.*/


import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.Read;
import lt.sdaacademy.advancefeaturescoding.codingexcecises.advanced.excercise10.services.VendingMachine;

public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = Read.read();
        System.out.println(vendingMachine);

    }
}
