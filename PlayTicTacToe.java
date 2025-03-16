package TicTacToe;

import TicTacToe.board.Board;
import TicTacToe.board.TicTacToeBoard;
import TicTacToe.move.Move;
import TicTacToe.player.Player;
import TicTacToe.symbols.Symbol;

import java.util.Queue;

public class PlayTicTacToe {

    private final Queue<Player> players;

    private final Board board;

    public PlayTicTacToe(Queue<Player> players) {
        this.players = players;
        this.board = new TicTacToeBoard();
    }

    public void play() {
        while (true) {
            Player player = players.poll();
            System.out.println(player.getPlayerName() + " Turn");
            this.board.display();
            Move move = player.createMove();
            Symbol symbol = player.getSymbol();
            this.board.applyMove(move, symbol);
            if (symbol.isGameComplete(move)) {
                this.board.display();
                System.out.println(player.getPlayerName() + " WON!");
                break;
            }
            players.add(player);
        }
    }

}
