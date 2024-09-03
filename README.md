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

## Software Lifecycle
1. To-Do: Task wird im Kanban-Board erstellt und priorisiert.
2. In Progress: Task wird übernommen und bearbeitet. Eine Feature-Branch wird erstellt.
3. Code Review: Pull-Request wird erstellt und der Code geprüft.
4. Testing: Task wird getestet, um sicherzustellen, dass alles korrekt funktioniert.
5. Done: Task ist abgeschlossen und in den Hauptzweig integriert.

## Github Actions

Nachdem eine Feature Branch in die Main Branch kommt, werden automatisch zwei Jobs ausgeführt. 

Job 1: Das Testen von den User Tests
![Github Action Testing](images%2FGitHub-Action-1.PNG)

![Test-1.PNG](images%2FTest-1.PNG)

Nach den erfolgreichen Tests, beginnt das Deployment der Software.

![Github Action Deploy](images%2FGitHub-Action-2.PNG)

- Aus dem Code wird ein Jar File erstellt
- Das Jar File wird nochmals auf Fehler überprüft
- Der WorkFlow überprüft auf die passende Versionierung
- Erstellt anschließend ein Release

![Release-Output.PNG](images%2FRelease-Output.PNG)
