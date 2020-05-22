public class King implements Piece {

    public boolean color, hasMoved;
    public int x, y;

    public King(boolean color, int x, int y) {
        this.color = color;
        this.hasMoved = false;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "K";
    }

    public boolean inCheck(Board b) {

    }

    public Square[] influence() {
        
    }

    public Square[] getLegalMoves() {

    }

}
