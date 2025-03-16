package TicTacToe.player;

import TicTacToe.move.Move;
import TicTacToe.symbols.Symbol;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String players, Symbol symbol) {
        super(players, symbol);
    }

    @Override
    public Move createMove() {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        return new Move(x,y);
    }


}
