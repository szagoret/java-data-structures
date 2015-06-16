package dsa.fundamental.arrays;

import java.util.Arrays;

/**
 *
 * @author szagoret
 */
public class Main {

    public static void main(String[] args) {
        ScoreBoard board = new ScoreBoard(10);
        board.add(new GameEntry("Sasa", 12));
        board.add(new GameEntry("Igor", 21));
        board.add(new GameEntry("Valea", 4));
        board.add(new GameEntry("Koela", 67));

        System.out.println("Entries: " + Arrays.toString(board.getBoard()));

        board.add(new GameEntry("Test", 3));
        System.out.println("Add new entry with score 3 : " + Arrays.toString(board.getBoard()));
        GameEntry removed = board.remove(1);
        System.out.println("Remove an entry at position 1 : " + Arrays.toString(board.getBoard()));
    }
}
