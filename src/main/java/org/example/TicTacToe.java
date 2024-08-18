package org.example;

import java.util.Scanner;

public class TicTacToe {
    /**
     * Die Klasse TicTacToe implementiert das Tic-Tac-Toe-Spiel.
     * Sie verwaltet die Spieler, das Spielfeld und den Spielablauf.
     */

    // Spieler 1
    public Player player1;
    // Spieler 2
    public Player player2;
    // Der Spieler, der aktuell am Zug ist
    public Player currentPlayer;
    // Das Spielfeld des Spiels
    public Board board;

    public TicTacToe(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board(); // Initialisiere ein neues Spielfeld
        currentPlayer = player1; // Setze den ersten Spieler als aktuellen Spieler
    }

}
