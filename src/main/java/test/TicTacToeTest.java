package test;

import org.example.Player;
import org.example.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TicTacToeTest {

    private TicTacToe game;
    private Player player1;
    private Player player2;


    /**
     * set up wird vor jedem test ausgeführt, sodass immer ein 'frisches' Feld existiert
     */
    @BeforeEach
    public void setUp() {
        player1 = new Player('X');
        player2 = new Player('O');
        game = new TicTacToe(player1, player2);
    }

    /**
     * testet auf einen horizontalen gewinn
     * nach jedem spielzug wird erneut getestet
     */
    @Test
    public void testHasWinnerHorizontal(){
        assertFalse(game.hasWinner());

        game.board.place(0,0, 'X');
        assertFalse(game.hasWinner());
        game.board.place(0,1, 'X');
        assertFalse(game.hasWinner());
        game.board.place(0,2, 'X');

        assertTrue(game.hasWinner());
    }

    /**
     * testet auf einen vertikalen gewinn
     * da der 'O' marker verwendet worden ist muss der currentPlayer gewechselt werden vor dem check
     */
    @Test
    public void testVerticalWin() {
        game.board.place(0, 0, 'O');
        game.board.place(1, 0, 'O');
        game.board.place(2, 0, 'O');
        game.currentPlayer = player2;
        assertTrue(game.hasWinner());
    }

    /**
     * testet auf einen diagonalen gewinn
     */
    @Test
    public void testDiagonalWin() {
        game.board.place(0, 0, 'X');
        game.board.place(1, 1, 'X');
        game.board.place(2, 2, 'X');
        assertTrue(game.hasWinner());
    }

    /**
     * testet ob nach befüllen aller felder ohne gewinn auch keiner angezeigt wird
     */
    @Test
    public void testNoWinner() {
        game.board.place(0, 0, 'X');
        game.board.place(0, 1, 'O');
        game.board.place(0, 2, 'X');
        game.board.place(1, 0, 'X');
        game.board.place(1, 1, 'X');
        game.board.place(1, 2, 'O');
        game.board.place(2, 0, 'O');
        game.board.place(2, 1, 'X');
        game.board.place(2, 2, 'O');
        assertFalse(game.hasWinner());
    }
}
