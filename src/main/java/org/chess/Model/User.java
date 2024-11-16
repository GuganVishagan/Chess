package org.chess.Model;

import org.chess.Enum.PieceColor;

import java.util.UUID;

public class User {
    UUID userId;
    String name;
    String password;
    String email;
    PieceColor pieceColor;
    boolean isCurrentTurn;

    public User(String name, String password, String email, PieceColor pieceColor, UUID userId) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.pieceColor = pieceColor;
        this.isCurrentTurn = false;
    }

    public String getEmail() {
        return email;
    }

    public String getName (String name) {
        return name;
    }

    public String getPassword () {
        return password;
    }

    public PieceColor getPieceColor () {
        return pieceColor;
    }

    public UUID getUserId() {
        return userId;
    }

    public boolean isCurrentTurn() {
        return isCurrentTurn;
    }

    public void setCurrentTurn(boolean isCurrentTurn) {
        this.isCurrentTurn = isCurrentTurn;
    }
}
