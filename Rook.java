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
        return "R";
    }

    // This is a work in progress. This still doesnt account for captures
    public Square[] influence(Board b) {
        Square[] returnSquares = new Square[14];
        boolean upCont = true;
        boolean downCont = true;
        boolean rightCont = true;
        boolean leftCont = true;
        int count = 0;
        for (int i = 1; i < 8; i++) {
            if (this.y + i < 8 && rightCont && !b.boardList[this.x][this.y+i].isOccupied) {
                returnSquares[count] = b.boardList[this.x][this.y+i];
                count++;
            } else {
                rightCont = false;
            }
            if (this.y - i >= 0 && leftCont && !b.boardList[this.x][this.y-i].isOccupied) {
                returnSquares[count] = b.boardList[this.x][this.y-i];
                count++;
            } else {
                leftCont = false;
            }
            if (this.x - i >= 0 && upCont && !b.boardList[this.x - i][this.y].isOccupied) {
                returnSquares[count] = b.boardList[this.x - i][this.y];
                count++;
            } else {
                upCont = false;
            }
            if (this.x + i < 8 && downCont && !b.boardList[this.x + i][this.y].isOccupied) {
                returnSquares[count] = b.boardList[this.x + i][this.y];
                count++;
            } else {
                downCont = false;
            }
        }
        return returnSquares;
    }

    public Square[] getLegalMoves(Board b) {
        return null;
    }

}
