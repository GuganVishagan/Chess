package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public interface Validator {

    public boolean isValid(Position start, Position end, ChessBoard board);
}
