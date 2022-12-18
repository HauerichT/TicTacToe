public class Main {
    public static void main(String[] args) {

        TicTacToe tictactoe = new TicTacToe();

        tictactoe.macheZug(0,0);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(2,2);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(2,1);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(2,0);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(1,2);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(1,1);
        tictactoe.zeigeSpielfeld();

        tictactoe.macheZug(1,1);
        tictactoe.zeigeSpielfeld();
    }
}