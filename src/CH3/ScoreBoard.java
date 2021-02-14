package CH3;


public class ScoreBoard {
    private GameEntry[] board;
    private int numEntries = 0;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {
        int score = e.getScore();
        if (numEntries < board.length || score > board[numEntries - 1].getScore()) {
            if (numEntries < board.length)
                numEntries++;
            int j = numEntries - 1;
            while (j > 0 && score > board[j].getScore()) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry remove(int index) {
        if (index < 0 || index >= numEntries) throw new IndexOutOfBoundsException();
        int j = index + 1;
        GameEntry temp = board[index];
        while (j < numEntries) {
            board[j - 1] = board[j];
            j++;
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }
}
