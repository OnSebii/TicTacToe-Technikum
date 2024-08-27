# TicTacToe-Technikum

Dieses Projekt implementiert das klassische Tic-Tac-Toe-Spiel in Java. Die Spieler setzen abwechselnd ihre Zeichen auf ein 3x3-Feld. Das Ziel des Spiels ist es, drei gleiche Zeichen in einer Reihe, Spalte oder Diagonale zu platzieren.

## Projektstruktur

- **src/main/java/org/example/**: Der Hauptcode des Spiels.
    - `TicTacToe`: Implementiert die Spiellogik.
    - `Player`: Repräsentiert einen Spieler.
    - `Board`: Verwalter des Spielfelds.
    - `Main`: Der Einstiegspunkt des Programms.

- **src/test/**: Unit-Tests.
    - `BoardTest`: Tests für die `Board`-Klasse.
    - `TicTacToeTest`: Tests für die `TicTacToe`-Klasse.

## Voraussetzungen

- Java 8 oder neuer
- Maven

## Installationsanleitung

1. Klonen Sie das Repository:
   ```bash
   git clone https://github.com/OnSebii/TicTacToe-Technikum.git
   cd TicTacToe-Technikum

Bauen Sie das Projekt mit Maven:
mvn clean install

Starten Sie das Spiel:
mvn exec:java -Dexec.mainClass="org.example.Main"

Tests
Führen Sie die Tests aus mit:
mvn test
![img.png](img.png)