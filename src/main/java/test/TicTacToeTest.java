package test;

import org.example.Player;
import org.example.TicTacToe;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TicTacToeTest {

    @Test
    public void TestHasWinnerHorizontal(){
        Player playerX = new Player('X');
        Player playerY = new Player('O');
        TicTacToe game = new TicTacToe(playerX, playerY);

        assertFalse(game.hasWinner());

        game.board.place(0,0, playerX.marker);
        assertFalse(game.hasWinner());
        game.board.place(0,1, playerX.marker);
        assertFalse(game.hasWinner());
        game.board.place(0,2, playerX.marker);

        assert(game.hasWinner());
    }
}
