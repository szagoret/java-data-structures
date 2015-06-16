package dsa.fundamental.arrays;

/**
 *
 * @author szagoret
 */
public class ScoreBoard {

    private int numEntries = 0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry gameEntry) {
        int newScore = gameEntry.getScore();

        // is the new entry really a high score?
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) { // no score drops from the board
                numEntries++;// so overall number increases
            }

            // shift any lower scores rightaward to make room for the new entry
            int j = numEntries - 1; // index of the last GameEntry
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1]; // shift entry from j-1 to j
                j--; // and decrement j
            }
            board[j] = gameEntry;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntry temp = board[i]; // save the object to be removed
        for (int j = i; j < numEntries - 1; j++) { // count up from i (not down)
            board[j] = board[j + 1]; // move one cell to the left
            board[numEntries - 1] = null; // null out the old last score
            numEntries--;
        }
        return temp; // return the removed object
    }

    public GameEntry[] getBoard() {
        return board;
    }

}
