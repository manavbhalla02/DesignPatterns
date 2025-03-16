package TicTacToe.board;

import TicTacToe.move.Move;
import TicTacToe.properties.TicTacToeCell;
import TicTacToe.symbols.Symbol;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeBoard implements Board {

    private final List<List<TicTacToeCell>> board;

    private final static int ROW_COUNT = 3;

    private final static int COL_COUNT = 3;

    public TicTacToeBoard() {
        this.board = new ArrayList<>();
        for(int i=0;i<ROW_COUNT;i++) {
            List<TicTacToeCell> boardRow = new ArrayList<>();
            for(int j=0;j<COL_COUNT;j++) {
                boardRow.add(new TicTacToeCell(i,j));
            }
            this.board.add(boardRow);
        }
    }


    @Override
    public void display() {
        for(int i=0;i<ROW_COUNT;i++) {
            for(int j=0;j<COL_COUNT;j++) {
                TicTacToeCell cell = this.board.get(i).get(j);
                System.out.print(cell.getSymbol() + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void applyMove(Move move, Symbol symbol) {
        symbol.move(move);
        TicTacToeCell cell = this.board.get(move.getRowPosition()).get(move.getColPosition());
        cell.setSymbol(symbol);
    }
}
