package org.chess.Strategies;


import org.chess.Model.ChessBoard;
import org.chess.Model.Piece;
import org.chess.Model.Position;
import org.chess.Model.User;

public class ChessBoardManager {
    private ChessBoard board;
    private Validator validator;
    private UserValidator userValidator;


    public ChessBoardManager(ChessBoard board, Validator validator, UserValidator userValidator) {
        this.board = board;
        this.validator = validator;
        this.userValidator = userValidator;
    }

    public ChessBoard getBoard() {
        return board;
    }

    public void setBoard(ChessBoard board) {
        this.board = board;
    }
    public boolean movePiece(Position start, Position end, User user){
        Piece piece = board.getCurrentBoard()[start.getRow()][start.getColumn()];
        validator = getValidator(piece);
        if(validator.isValid(start, end, board) && userValidator.validateCurrentUserPosition(user)) {
            board.getCurrentBoard()[end.getRow()][end.getColumn()] = piece;
            board.getCurrentBoard()[start.getRow()][start.getColumn()] = null;
            return true;
        }
        return false;
    }

}
