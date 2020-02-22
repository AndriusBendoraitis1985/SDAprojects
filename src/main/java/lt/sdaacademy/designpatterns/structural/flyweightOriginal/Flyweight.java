package lt.sdaacademy.designpatterns.structural.flyweightOriginal;

import java.awt.Color;
import java.util.Random;

public class Flyweight {

    private static final int CANVAS_SIZE=500;
    private static final int TREES_TO_DRAW=1000000;
    private static final int TREE_TYPES=2;

    public static void main(String[] args) {
        Random random = new Random();
        Forest forest = new Forest();

        drawForest (random, forest);
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        printMemoryUsage();
    }
    //TODO check, why flyweightOriginal is not working. compare with flyweight

    private static void drawForest (Random random, Forest forest){
        for (int i = 0; i< Math.floor(TREES_TO_DRAW/TREE_TYPES); i++){
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
    }

    private static void printMemoryUsage(){
        System.out.println(TREES_TO_DRAW + "trees drawn");
        System.out.println("___________________________");
        System.out.println("Memory usage: ");
        System.out.println("Tree size (8 bytes) * "+ TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * "+ TREE_TYPES + "");
        System.out.println("___________________________");
        System.out.println("Total: " + ((TREES_TO_DRAW*8 + TREE_TYPES*30)/1024/1024) + "MB (instead of " + ((TREES_TO_DRAW*38)/1024/1024) + "MB)");
    }
}
