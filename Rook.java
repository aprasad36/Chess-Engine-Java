public class Rook implements Piece {

    public boolean color;
    public boolean hasMoved;
    public int x, y;

    public Rook(boolean color, Square s) {
        this.color = color;
        this.x = s.x - 1;
        this.y = s.y - 1;
        s.occupy(this);
    }

    public String toString() {
        if (color) {
            return "Rw";
        } else {
            return "Rb";
        }
    }

    public boolean getColor() {
        return color;
    }


    // This doesn't work
    public int move(Board b, Square s) {
        if s.squareInArray(this.influence(b)) {
            if
            return 0;
        }
        return 1;
    }

    // Returns the influence of the rook. This doesn't always give legal moves because the rook might be pinned to the king.
    public Square[] influence(Board b) {
        Square[] returnSquares = new Square[14];
        boolean up = true;
        boolean down = true;
        boolean right = true;
        boolean left = true;
        int count = 0;
        for (int i = 1; i < 8; i++) {
            if (y + i < 8 && right) {
                if (!b.boardList[x][y+i].isOccupied) {
                    returnSquares[count] = b.boardList[x][y+i];
                    count++;
                } else {
                    if (color != b.boardList[x][y+i].occupiedBy.getColor()) {
                        returnSquares[count] = b.boardList[x][y+i];
                        count++;
                    }
                    right = false;
                }
            }
            if (y - i >= 0 && left) {
                if (!b.boardList[x][y-i].isOccupied) {
                    returnSquares[count] = b.boardList[x][y-i];
                    count++;
                } else {
                    if (color != b.boardList[x][y-i].occupiedBy.getColor()) {
                        returnSquares[count] = b.boardList[x][y-i];
                        count++;
                    }
                    left = false;
                }
            }
            if (x - i >= 0 && up) {
                if (!b.boardList[x-i][y].isOccupied) {
                    returnSquares[count] = b.boardList[x-i][y];
                    count++;
                } else {
                    if (color != b.boardList[x-i][y].occupiedBy.getColor()) {
                        returnSquares[count] = b.boardList[x-i][y];
                        count++;
                    }
                    up = false;
                }
            }
            if (x + i < 8 && down) {
                if (!b.boardList[x+i][y].isOccupied) {
                    returnSquares[count] = b.boardList[x+i][y];
                    count++;
                } else {
                    if (color != b.boardList[x+i][y].occupiedBy.getColor()) {
                        returnSquares[count] = b.boardList[x+i][y];
                        count++;
                    }
                    down = false;
                }
            }
        }
        return returnSquares;
    }

    public Square[] getLegalMoves(Board b) {
        return null;
    }

}
