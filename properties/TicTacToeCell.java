package TicTacToe.properties;

import TicTacToe.symbols.Symbol;

import java.util.Objects;

public class TicTacToeCell {

    private final int rowPosition;

    private final int colPosition;

    private Symbol symbol;

    public TicTacToeCell(int rowPosition, int colPosition) {
        this.rowPosition = rowPosition;
        this.colPosition = colPosition;
    }


    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return Objects.isNull(symbol)?"-":symbol.getSymbol();
    }
}
