package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class PawnValidator implements Validator {

    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        if(start.getRow() == 2){
            return end.getRow() > start.getRow() && end.getRow() < start.getRow() + 2;
        }
        else return end.getRow() == start.getRow() + 1;
    }
}
