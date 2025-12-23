package ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {

    private final Board board;
    private final Player[] players;
    private int currentPlayerIndex;
    private GameStatus status;
    private Player winner;
    private final WinningStrategy winningStrategy;

    public TicTacToeGame(int boardSize, Player[] players, WinningStrategy winningStrategy) {
        this.board = new Board(boardSize);
        this.players = players;
        this.currentPlayerIndex = 0;
        status = GameStatus.IN_PROGRESS;
        this.winningStrategy = winningStrategy;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public GameStatus getStatus() {
        return status;
    }

    public Player getWinner() {
        return winner;
    }

    public boolean makeMove(int row, int col) {
        if (status != GameStatus.IN_PROGRESS) {
            System.out.println("Game is already over!");
            return false;
        }
        Player currentPlayer = getCurrentPlayer();
        Move move = new Move(row, col, currentPlayer.getSymbol());
        if (!board.isValidMove(row, col)) {
            System.out.println("Invalid move! Try again.");
            return false;
        }
        board.makeMove(move);
        board.displayBoard();

        if (winningStrategy.checkWin(move, board)) {
            status = GameStatus.PLAYER_WON;
            winner = currentPlayer;
            System.out.println("🎉 " + currentPlayer.getName() + " wins!");
            return true;
        }


        if (board.isFull()) {
            status = GameStatus.DRAW;
            System.out.println("It's a draw!");
            return true;
        }

        currentPlayerIndex = (currentPlayerIndex + 1) % players.length;


        return true;
    }

    public void displayBoard() {
        board.displayBoard();
    }

    public void reset() {
        board.reset();
        currentPlayerIndex = 0;
        status = GameStatus.IN_PROGRESS;
        winner = null;
        System.out.println("Game reset!");
    }

    void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎮 Tic Tac Toe Started!");
        board.displayBoard();


        while (status == GameStatus.IN_PROGRESS) {

            Player current = players[currentPlayerIndex];
            System.out.println("\n" + current.getName() + "'s turn (" + current.getSymbol() + ")");

            System.out.print("Enter row: ");
            int row = sc.nextInt();
            System.out.print("Enter col: ");
            int col = sc.nextInt();
            boolean successful = makeMove(row, col);

            if (!successful) {
                continue;
            }



        }
        if (status == GameStatus.PLAYER_WON) {
            System.out.println("🏆 Winner: " + winner.getName());
        } else if (status == GameStatus.DRAW) {
            System.out.println("🤝 Game ended in a draw.");
        }

        sc.close();
    }
}
