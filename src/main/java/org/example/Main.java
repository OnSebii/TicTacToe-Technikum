package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the FH-Technikum Tic Tac Toe game!");
        // Init two players, board and the game
        Player playerX = new Player('X');
        Player playerY = new Player('O');
        TicTacToe game = new TicTacToe(playerX, playerY);

        // Start the game
        game.play();
    }
}