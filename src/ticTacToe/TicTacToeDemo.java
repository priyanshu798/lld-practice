package ticTacToe;

public class TicTacToeDemo {
    static void main() {
        Player alice = new Player("Alice", Symbol.O);
        Player bob = new Player("Bob", Symbol.X);

        TicTacToeGame game = new TicTacToeGame(3, new Player[]{alice, bob}, new WinningStrategy());
        game.startGame();
    }



}
