package ticTacToe;

public class WinningStrategy {
    public boolean checkWin(Move lastMove, Board board) {

        int size = board.getSize();
        int row = lastMove.getRow();
        int col = lastMove.getCol();
        Symbol symbol = lastMove.getSymbol();

        boolean rowWin = true;
        for (int j = 0; j < size; j++) {
            if (board.getCell(row, j) != symbol) {
                rowWin = false;
                break;
            }
        }
        if (rowWin) return true;

        boolean colWin = true;
        for (int i = 0; i < size; i++) {
            if (board.getCell(i, col) != symbol) {
                colWin =false;
                break;
            }
        }
        if (colWin) return true;

        if (row == col) {
            boolean diagWin = true;
            for (int i = 0; i < size; i++) {
                if (board.getCell(i, i) != symbol) {
                    diagWin = false;
                    break;
                }
            }
            if (diagWin) return true;
        }

        // Check anti-diagonal (top-right to bottom-left)
        if (row + col == size - 1) {
            boolean antiDiagWin = true;
            for (int i = 0; i < size; i++) {
                if (board.getCell(i, size - 1 - i) != symbol) {
                    antiDiagWin = false;
                    break;
                }
            }
            if (antiDiagWin) return true;
        }

        return false;

    }
}
