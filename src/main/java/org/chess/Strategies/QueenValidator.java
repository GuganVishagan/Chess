package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;

public class QueenValidator implements Validator {
    private RookValidator rookValidator;
    private BishopValidator bishopValidator;

    public QueenValidator(BishopValidator bishopValidator, RookValidator rookValidator) {
        this.bishopValidator = bishopValidator;
        this.rookValidator = rookValidator;
    }
    @Override
    public boolean isValid(Position start, Position end, ChessBoard board) {
        return bishopValidator.isValid(start, end, board) || rookValidator.isValid(start, end, board);
    }
}
