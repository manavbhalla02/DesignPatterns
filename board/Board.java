package TicTacToe.board;

import TicTacToe.move.Move;
import TicTacToe.symbols.Symbol;

public interface Board {

    void display();

    void applyMove(Move move, Symbol symbol);
}
