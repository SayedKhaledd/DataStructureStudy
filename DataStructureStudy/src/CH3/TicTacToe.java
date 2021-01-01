package CH3;

public class TicTacToe {
    private static final int X = 1, O = -1, EMPTY = 0;
    private int[][] board = new int[3][3];
    private int player;

    public TicTacToe() {
        clearBoard();
    }

    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
        player = X;
    }

    public void putMark(int i, int j) {
        if (i > 2 || i < 0 || j > 2 || j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (board[i][j] != EMPTY) {
            throw new IndexOutOfBoundsException();
        }
        board[i][j] = player;
        player = -player;
    }

    public boolean isWin(int mark) {
        return (board[0][0] + board[0][1] + board[0][2] == mark * 3)
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3)
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3)
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3)
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3)
                || (board[0][1] + board[1][1] + board[2][0] == mark * 3);
    }
    public int Winner(){
        if(isWin(X))return X;
        else if(isWin(O))return O;
        else return EMPTY;
    }

     public String toString( ) {
        StringBuilder sb = new StringBuilder( );
         for (int i=0; i<3; i++) {
             for (int j=0; j<3; j++) {
                 switch (board[i][j]) {
                     case X: sb.append("X"); break;
             case O: sb.append("O"); break;
             case EMPTY: sb.append(" "); break;
             }
             if (j < 2) sb.append("|"); // column boundary
             }
             if (i < 2) sb.append("\n-----\n"); // row boundary
             }
         return sb.toString( );
         }
}
