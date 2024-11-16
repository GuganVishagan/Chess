package org.chess.Strategies;

import org.chess.Model.Piece;

public class ValidatorFactory {

    public static Validator getValidator(Piece piece) {
        return switch (piece.getType()){
            case PAWN -> new PawnValidator();
            case KNIGHT -> new KnightValidator();
            case BISHOP -> new BishopValidator();
            case ROOK -> new RookValidator();
            case KING -> new KingValidator();
            case QUEEN -> new QueenValidator(new BishopValidator(), new RookValidator());
            default -> throw new IllegalArgumentException("Invalid piece type");
        };
    }
}
