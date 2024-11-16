package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class KingValidator implements Validator {
    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        return (Math.abs(end.getRow() - start.getRow()) == 1 || Math.abs((int)end.getColumn() - (int)start.getColumn()) == 1);
    }
}
