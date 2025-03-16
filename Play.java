package TicTacToe;

import TicTacToe.player.HumanPlayer;
import TicTacToe.player.Player;
import TicTacToe.symbols.Cross;
import TicTacToe.symbols.Zero;

import java.util.ArrayDeque;
import java.util.Queue;

public class Play {
    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Newton", new Zero());
        Player player2 = new HumanPlayer("Albert", new Cross());
        Queue<Player> players = new ArrayDeque<>();
        players.add(player1);
        players.add(player2);
        new PlayTicTacToe(players).play();

    }
}
