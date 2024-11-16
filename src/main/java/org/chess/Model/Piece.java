package org.chess.Model;

import org.chess.Enum.PieceColor;
import org.chess.Enum.PieceType;

import java.lang.reflect.Type;

public class Piece {
    private PieceColor color;
    private PieceType type;
    private Position postion;

    public Piece(PieceColor color, PieceType type, Position postion) {
        this.color = color;
        this.type = type;
        this.postion = postion;
    }

    public Position getPostion() {
        return postion;
    }

    public PieceColor getColor() {
        return color;
    }
    public PieceType getType() {
        return type;
    }
}
