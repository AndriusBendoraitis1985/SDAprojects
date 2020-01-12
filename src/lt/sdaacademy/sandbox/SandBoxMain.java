package lt.sdaacademy.sandbox;


public class SandBoxMain {


        public static void main(String[] args) {

            int fieldCount = 0;

            outerEdge();
            fieldCount = innerEdge(fieldCount);
            outerEdge();
            fieldCount = innerEdge(fieldCount);
            outerEdge();
            fieldCount = innerEdge(fieldCount);
            outerEdge();
        }

        private static void outerEdge() {
            for (int i = 0; i < 13; i++) {
                System.out.print("-");
            }
            System.out.printf("%n");
        }

        private static int innerEdge(int fieldCount) {

            for (int i = 0 ; i < 13 ; i++) {
                if ( i == 0 || i == 4 || i == 8 || i == 12) {
                    System.out.print("|");
                } else  if ( i == 2 || i == 6 || i == 10) {
                    System.out.print(fieldCount);
                    fieldCount = fieldCount +1;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("%n");
            return fieldCount;
        }
    }