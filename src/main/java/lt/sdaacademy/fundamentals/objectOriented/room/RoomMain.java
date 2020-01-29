package lt.sdaacademy.fundamentals.objectOriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {

        System.out.println("prasome vesti kambario ploti");

        Scanner input = new Scanner(System.in);
        int width = input.nextInt();

        System.out.println("prasome vesti kambario ilgi");
        int lenth = input.nextInt();

        Room room = new Room(width, lenth);

        int squareOfRoom = countSquareOfRoom(room.getWidth(), room.getLenth());

        System.out.println("kambario plotas yra: " + room.getWidth() * room.getLenth());
        System.out.println("kambario plotas yra: " + squareOfRoom);
    }

    private static int countSquareOfRoom(int lenth, int width) {
        return (lenth * width);
    }

}
