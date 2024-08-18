package test;

import org.example.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTest {

        @Test
        public void testIsCellEmpty_EmptyCell() {
            Board board = new Board();
            assertTrue(board.isCellEmpty(0, 0), "Cell should be empty");
        }

        @Test
        public void testIsCellEmpty_FilledCell() {
            Board board = new Board();
            board.place(0, 0, 'X');
            assertFalse(board.isCellEmpty(0, 0), "Cell should not be empty");
        }

        @Test
        public void testIsIndexInRange_ValidIndex() {
            Board board = new Board();
            assertTrue(board.isIndexInRange(1, 1), "Index should be in range");
        }

        @Test
        public void testIsIndexInRange_InvalidIndex() {
            Board board = new Board();
            assertFalse(board.isIndexInRange(3, 3), "Index should be out of range");
        }

        @Test
        public void testPlace_ValidPlacement() {
            Board board = new Board();
            board.place(1, 1, 'O');
            assertEquals('O', board.cells[1][1], "Cell should contain 'O'");
        }

        @Test
        public void testPlace_InvalidPlacement_CellNotEmpty() {
            Board board = new Board();
            board.place(0, 0, 'X');
            board.place(0, 0, 'O');
            assertEquals('X', board.cells[0][0], "Cell should still contain 'X'");
        }

}
