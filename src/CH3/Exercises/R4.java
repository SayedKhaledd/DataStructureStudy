package CH3.Exercises;

import CH3.TicTacToe;

public class R4 extends TicTacToe {
    @Override
    public void putMark(int i, int j) {
        if (winner() != 0) throw new IllegalStateException();
        super.putMark(i, j);
    }

    public static void main(String[] args) {
        R4 game = new R4();

        game.putMark(0, 0);
        game.putMark(1, 1);
        game.putMark(0, 1);
        game.putMark(1, 0);
        game.putMark(0, 2);

        System.out.println(game);
        int winningPlayer = game.winner();
        String[] outcome = {"O wins", "Tie", "X wins"}; // rely on ordering
        System.out.println(outcome[1 + winningPlayer]);

        game.putMark(2, 0);

    }
}
