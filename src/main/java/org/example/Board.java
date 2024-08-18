package org.example;

public class Board {
    //ist das eigentliche Spielfeld
    public char[][] cells;

    public Board() {
        //definiert das spielfeld als 3x3
        cells = new char[3][3];
        //setzt die leeren felde auf blankspace damit die print-funktion optisch besser aussieht
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++) {
                cells[i][j] = ' ';
            }
        }
    }

}
