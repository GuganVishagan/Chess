package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class KnightValidator implements Validator {

    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        if(((end.getRow() == start.getRow() + 2) && end.getColumn() == (char)(start.getColumn() + 1)) || ((end.getRow() == start.getRow() - 2) && end.getColumn() == (char)(start.getColumn() - 1))) {
            return true;
        }
        return ((end.getRow() == start.getRow() + 1) && end.getColumn() == (char) (start.getColumn() + 2)) || ((end.getRow() == start.getRow() - 1) && end.getColumn() == (char) (start.getColumn() - 2));
    }
}
