package TicTacToe.player;

import TicTacToe.move.Move;
import TicTacToe.symbols.Symbol;

public abstract class Player {

    private final String players;

    private final Symbol symbol;

    public Player(String players, Symbol symbol) {
        this.players = players;
        this.symbol = symbol;
    }

    public abstract Move createMove();

    public String getPlayerName() {
        return this.players;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
