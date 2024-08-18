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



    public boolean isCellEmpty(int x, int y) {
        return cells[x][y] ==' ';
    }

    //checkt ob der gegebene index gültig ist
    public boolean isIndexInRange(int x, int y) {
        return x < cells.length && x >= 0 && y < cells[x].length && y >= 0;
    }

    //setzt einen marker aufs feld, sofern dieses noch nicht vergeben ist
    public void place(int x, int y, char marker) {
        if (isCellEmpty(x, y)){
            cells[x][y] = marker;
        }
    }



}
