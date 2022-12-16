public class TicTacToe {

    private int[] feld = {1,2,3,4,5,6,7,8,9};
    private static final int turnX = 1;
    private static final int turnO = 2;
    private static int turn = turnX;



    TicTacToe() {
        reset();
    }

    public void reset() {
        this.feld = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public void macheZug(int x, int y) {
        if (y == 0){
            int c1 = 0;
            for (int i = 0; i < 3 ; i++) {
                if (x == c1 && feld[i] != 0) {
                    System.out.println("Feld bereits belegt! Feld bleibt weiterhin:");
                }
                if (x == c1 && feld[i] == 0) {
                    feld[i] = turn;
                }
                c1++;
            }
        }

        if (y == 1) {
            int c2 = 0;
            for (int j = 3; j < 6 ; j++) {
                if (x == c2 && feld[j] != 0) {
                    System.out.println("Feld bereits belegt! Feld wird nicht gesetzt!");
                }
                if (x == c2 && feld[j] == 0) {
                    feld[j] = turn;
                }
                c2++;
            }
        }

        if (y == 2) {
            int c3 = 0;
            for (int k = 6; k < 9 ; k++) {
                if (x == c3 && feld[k] != 0) {
                    System.out.println("Feld bereits belegt! Feld wird nicht gesetzt!");
                }
                if (x == c3 && feld[k] == 0) {
                    feld[k] = turn;
                }
                c3++;
            }
        }

        if (turn == turnX) {
            turn = turnO;
        } else {
            turn = turnX;
        }
    }

    public void zeigeSpielfeld() {
        for (int i = 0; i < 3 ; i++) {
            if (i == 2) {
                System.out.print(feld[i]);
            }
            else {
                System.out.print(feld[i] + " | ");
            }
        }

        System.out.println("\n- + - + -");

        for (int j = 3; j < 6 ; j++) {
            if (j == 5) {
                System.out.print(feld[j]);
            }
            else {
                System.out.print(feld[j] + " | ");
            }
        }

        System.out.println("\n- + - + -");

        for (int k = 6; k < 9 ; k++) {
            if (k == 8) {
                System.out.print(feld[k]);
            }
            else {
                System.out.print(feld[k] + " | ");
            }
        }

        System.out.print("\n\n");
    }

}
