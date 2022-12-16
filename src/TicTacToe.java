public class TicTacToe {

    private int[] feld = {1,2,3,4,5,6,7,8,9};

    TicTacToe() {
        reset();
    }

    public void reset() {
        //this.feld = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    public void macheZug(int x, int y) {

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

    }

}
