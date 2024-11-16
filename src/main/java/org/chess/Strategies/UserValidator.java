package org.chess.Strategies;

import org.chess.Model.ChessBoard;
import org.chess.Model.Position;
import org.chess.Model.User;

public class UserValidator {
    public boolean validateCurrentUserPosition(User user) {
       return user.isCurrentTurn();
    }
}
