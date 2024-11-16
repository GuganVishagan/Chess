package org.chess.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ChessBoard {
    private final Piece [][] board;
    public int boardDimension;
    public Map<UUID, Piece > accumulatedPieces;

    public ChessBoard(int boardDimension) {
        this.board = new Piece[boardDimension][boardDimension];
        this.accumulatedPieces = new HashMap<>();
    }

    public Piece[] [] getCurrentBoard() {
        return board;
    }

    public int getBoardDimension(){
        return board.length;
    }

    public Map<UUID, Piece> getAccumulatedPieces(){
        return accumulatedPieces;
    }
}
