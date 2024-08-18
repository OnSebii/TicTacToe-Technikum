package org.example;

public class Board {
    //ist das eigentliche Spielfeld
    public char[][] cells;

    public Board() {
        //definiert das spielfeld als 3x3
        cells = new char[3][3];
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

    //zeigt das spielfeld an
    public void print() {
        for (int i = 0; i<=2;i++){
            /*
                printed eine cell
                falls diese leer ist wird ein blankspace gesetzt
                am ende ein vertikaler trennstrich
             */
            System.out.print((cells[i][0] == '\u0000') ? ' ' : cells[i][0] +"|");
            System.out.print((cells[i][1] == '\u0000') ? ' ' : cells[i][1] +"|");
            System.out.println((cells[i][2] == '\u0000') ? ' ' : cells[i][2]);
            //sofern es nicht die letzte reihe ist wird ein horizontaler trennstrich gestzt
            if(i<2) {
                System.out.println("------");
            }
        }
    }
}
