package lt.sdaacademy.designpatterns.structural.flyweight;

import java.awt.Color;
import java.util.Random;

public class Flyweight {

    private static final int CANVAS_SIZE = 500;
    private static final int TREE_TO_DRAW = 1000000;
    private static final int TREE_TYPE = 2;

    public static void main(String[] args) {
        Random random = new Random();
        Forest forest = new Forest();

        drawForest(random, forest);
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        printMemoryUsage();
    }

    private static void drawForest(Random random, Forest forest) {
        for (int i = 0; i < Math.floor(TREE_TO_DRAW / TREE_TYPE); i++) {
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random.nextInt(CANVAS_SIZE), random.nextInt(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
    }

    private static void printMemoryUsage() {
        System.out.println(TREE_TO_DRAW + " trees draw");
        System.out.println("_____________________");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) *" + TREE_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPE + " ");
        System.out.println("_____________________");
        System.out.println("Total: " + ((TREE_TO_DRAW * 8 + TREE_TYPE * 30) / 1024 / 1024) +
                "MB (intead of " + ((TREE_TO_DRAW * 38) / 1024 / 1024) + " MB)");
    }
}

