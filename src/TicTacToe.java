public class TicTacToe {

    private int[] feld = {0,0,0,0,0,0,0,0,0};
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

        if (feld[x+y*3] != 0) {
            System.out.println("Feld bereits belegt!");
            System.exit(0);
        }
        else {
            feld[x+y*3] = turn;
        }

        if (turn == turnX) {
            turn = turnO;
        } else {
            turn = turnX;
        }
    }

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

    public void zeigeSpielfeld() {
        System.out.print(getValue(feld[0]) + "|" + getValue(feld[1]) + "|" + getValue(feld[2]) + "\n");
        System.out.print("-+-+-\n");
        System.out.print(getValue(feld[3]) + "|" + getValue(feld[4]) + "|" + getValue(feld[5]) + "\n");
        System.out.print("-+-+-\n");
        System.out.print(getValue(feld[6]) + "|" + getValue(feld[7]) + "|" + getValue(feld[8]));

        System.out.print("\n\n");

    }

}
