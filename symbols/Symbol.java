package TicTacToe.symbols;

import TicTacToe.move.Move;

import java.util.HashMap;
import java.util.Map;

public abstract class Symbol {

    private final Map<Integer, Integer> rightDiagCounts;

    private final Map<Integer, Integer> leftDiagCounts;

    private final Map<Integer, Integer> rowCounts;

    private final Map<Integer, Integer> colCounts;


    private final static int TIC_TAC_TOE_SIZE = 3;

    protected Symbol() {
        this.rightDiagCounts = new HashMap<>();
        this.rowCounts = new HashMap<>();
        this.colCounts = new HashMap<>();
        this.leftDiagCounts = new HashMap<>();
    }

    public void move(Move move) {
     //   System.out.println(move.getRowPosition() + "-" + rowCounts.get(move.getRowPosition()));
        updateCounts(move.getColPosition() - move.getRowPosition(), rightDiagCounts);
        updateCounts(move.getColPosition(), colCounts);
        updateCounts(move.getRowPosition(), rowCounts);
        updateCounts(move.getColPosition() + move.getRowPosition(), leftDiagCounts);
    }

    private void updateCounts(int identifier, Map<Integer, Integer> cellCounts) {
        if (cellCounts.containsKey(identifier)) {
            cellCounts.compute(identifier, (k, cellCount) -> cellCount + 1);
        }
        else cellCounts.put(identifier, 1);
    }

    public boolean isGameComplete(Move move) {
       // System.out.println(move.getRowPosition() + " " + rowCounts.get(move.getRowPosition()));
        return checkIdentifier(move.getColPosition() - move.getRowPosition(), rightDiagCounts)
                || checkIdentifier(move.getRowPosition(), rowCounts)
                || checkIdentifier(move.getColPosition(), colCounts)
                || checkIdentifier(move.getColPosition() + move.getRowPosition(), leftDiagCounts);
    }

    private boolean checkIdentifier(int identifier, Map<Integer, Integer> cellCounts) {
        if (cellCounts.containsKey(identifier)) {
            Integer cellCount = cellCounts.get(identifier);
            return cellCount == TIC_TAC_TOE_SIZE;
        }
        return false;
    }

    public abstract String getSymbol();

}
