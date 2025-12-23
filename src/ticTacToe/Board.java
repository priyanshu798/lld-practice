package ticTacToe;

public class Board {

    private final int size;
    private final Symbol[][] grid;

    public Board(int size) {
        this.size = size;
        this.grid = new Symbol[size][size];
    }

    public int getSize() {
        return size;
    }

    public boolean isValidMove(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false;
        }
        return grid[row][col] == null;
    }

    public void makeMove(Move move) {
        if (!isValidMove(move.getRow(), move.getCol())) {
            throw new IllegalArgumentException("Invalid move");
        }
        grid[move.getRow()][move.getCol()] = move.getSymbol();
    }

    public Symbol getCell(int row, int col) {
        return grid[row][col];
    }
    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == null) return false;
            }
        }
        return true;
    }

    public void displayBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + grid[i][j] + " ");
                }
                if (j < size - 1) System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                for (int j = 0; j < size; j++) {
                    System.out.print("---");
                    if (j < size - 1) System.out.print("+");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    public void reset() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = null;
            }
        }
    }
}
