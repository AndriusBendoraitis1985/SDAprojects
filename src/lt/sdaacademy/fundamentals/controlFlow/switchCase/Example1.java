package lt.sdaacademy.fundamentals.controlFlow.switchCase;

public class Example1 {
    public static void main(String[] args) {
        // char negalime ivesti per scanner
        char directory = 'w';

        switch (directory) {
            case 'n':
                System.out.println("Keliaujame siaures kryptimi");
                break;
            case 's':
                System.out.println("Keliaujame pietu kryptimi");
                break;
            case 'e':
                System.out.println("Keliaujame rytu kryptimi");
                break;
            case 'w':
                System.out.println("Keliaujame vakaru kryptimi");
                break;
            default:
                System.out.println("Keliaujame nezinoma kryptimi");
                break;
        }

    }

    }

