package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class ChessBoardValidator implements Validator {
    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        return ((start.getRow() <=board.getBoardDimension() && start.getColumn()>=97 && (int)start.getColumn() <= 104) &&
                (end.getRow() <=board.getBoardDimension() && end.getColumn()>=97 && (int)end.getColumn() <= 104));
    }
}
