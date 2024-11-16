package org.chess.Model;

public class Position {
    private int row;
    private char column;

    public Position(int row, char column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }
}
