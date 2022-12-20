public class TicTacToe {

    // Instanzvariable für das Feld
    private int[] feld = {};

    // Instanzvariablen zur Steuerung des Zuges
    private static final int turnX = 1;
    private static final int turnO = 2;
    private static int turn = turnX;


    // Konstruktor - ruft Funktion reset auf um Spielfeld auf den initialen Wert zu setzen
    TicTacToe() {
        reset();
    }

    // Methode setzt das Spielfeld auf den initialen Wert zurück
    public void reset() {
        this.feld = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    // Methode setzt einen Zug
    public void macheZug(int x, int y) {

        // prüft, ob x und y Werte valide sind
        if (x < 3 && x >= 0 && y < 3 && y >= 0) {
            // prüft, ob das Feld bereits belegt ist
            if (feld[x+y*3] != 0) {
                System.out.println("Feld bereits belegt!");
                System.exit(0);
            }
            else {
                // setzt das Symbol an die gewählte Stelle
                feld[x+y*3] = turn;
            }

            // ändert den Zustand des turns
            if (turn == turnX) {
                turn = turnO;
            } else {
                turn = turnX;
            }
        }
        else {
            System.out.println("Übergebener Wert ist ungültig!");
            System.exit(0);
        }

    }

    // gibt den String-Wert des jeweiligen turns zurück
    public String getValue(int turn) {
        if (turn == turnX) {
            return "X";
        }
        else if (turn == turnO) {
            return "O";
        }
        else {
            return " ";
        }
    }

    // Methode gibt das aktuelle Spielfeld auf der Konsole aus
    public void zeigeSpielfeld() {
        System.out.print(getValue(feld[0]) + "|" + getValue(feld[1]) + "|" + getValue(feld[2]) + "\n");
        System.out.print("-+-+-\n");
        System.out.print(getValue(feld[3]) + "|" + getValue(feld[4]) + "|" + getValue(feld[5]) + "\n");
        System.out.print("-+-+-\n");
        System.out.print(getValue(feld[6]) + "|" + getValue(feld[7]) + "|" + getValue(feld[8]));

        System.out.print("\n\n");

    }

}
