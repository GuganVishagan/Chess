package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class RookValidator implements Validator {

    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        int currentBoardDimension = board.getBoardDimension();
        if((end.getRow() <= currentBoardDimension && end.getRow() >= 1) && (end.getColumn() == start.getColumn()))
            return true;
        else if(end.getRow() == start.getRow() && (int) end.getColumn() >= 97  && (int) end.getColumn() <= 104)
            return true;
        return false;
    }
}
