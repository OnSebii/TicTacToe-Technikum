package org.example;

public class Player {
    // Der Marker, den der Spieler verwendet, um seine Züge zu markieren
    public char marker;

    /**
     * Konstruktor für die Klasse Player.
     * Initialisiert den Spieler mit einem gegebenen Marker.
     */
    public Player(char marker){
        this.marker = marker;
    }

    // Gibt den Marker des Spielers zurück.
    public char getMarker() {
        return marker;
    }
}
