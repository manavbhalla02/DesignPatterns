package TicTacToe.move;

import TicTacToe.board.Board;
import TicTacToe.properties.TicTacToeCell;

import java.util.List;

public class Move {

    private final int rowPosition;

    private final int colPosition;


    public Move(int rowPosition, int colPosition) {
        this.rowPosition = rowPosition;
        this.colPosition = colPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColPosition() {
        return colPosition;
    }
}
