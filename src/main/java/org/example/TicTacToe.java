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

    public void play() {
        boolean switcher = false;  // Aktuellen Spieler wechseln
        Scanner sc = new Scanner(System.in);  // Scanner für Benutzereingaben

        // Schleife läuft, bis ein Gewinner feststeht
        while (!hasWinner()) {
            switcher = !switcher;  // Wechsel zwischen den Spielern
            currentPlayer = switcher ? player1 : player2;  // Setze den aktuellen Spieler

            while (true) {
                board.print();
                System.out.println("Current Player: " + currentPlayer.getMarker());  // Zeige den aktuellen Spieler an
                System.out.print("Row (0-2): ");
                int row = sc.nextInt();  // Lese die Zeile ein
                System.out.print("Column (0-2): ");
                int col = sc.nextInt();  // Lese die Spalte ein

                // Überprüfe, ob die Eingabe im gültigen Bereich liegt
                if (!board.isIndexInRange(row, col)) {
                    System.out.println("Index out of bounds. Try again!");
                    continue;
                }

                // Überprüfe, ob das gewählte Feld leer ist
                if (board.isCellEmpty(row, col)) {
                    board.place(row, col, currentPlayer.getMarker());  // Platziere den Marker des Spielers
                    break;  // Beende die innere Schleife und wechsle den Spieler
                }

                System.out.println("Field is already taken. Try again!");  // Feld ist bereits besetzt, fordere neue Eingabe
            }
        }

        board.print();  // Spielfeld nach Ende des Spiels ausgeben
        System.out.println("Player " + currentPlayer.getMarker() + " wins!");  // Zeige den Gewinner an
    }


    public boolean hasWinner() {
        /**
         * Überprüft, ob der aktuelle Spieler das Spiel gewonnen hat.
         * Ein Spieler gewinnt, wenn er drei seiner Marker in einer Reihe, Spalte oder Diagonale hat.
         */
        char m = currentPlayer.getMarker();

        // Überprüfe die Zeilen und Spalten
        for (int i = 0; i < 3; i++) {
            if ((board.cells[i][0] == m && board.cells[i][1] == m && board.cells[i][2] == m) ||
                    (board.cells[0][i] == m && board.cells[1][i] == m && board.cells[2][i] == m)) {
                return true;
            }
        }

        // Überprüfe die Diagonalen
        return (board.cells[0][0] == m && board.cells[1][1] == m && board.cells[2][2] == m) ||
                (board.cells[0][2] == m && board.cells[1][1] == m && board.cells[2][0] == m);
    }
}
