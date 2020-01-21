public class Piece {

    // Every Piece will need an isProtected boolean so that the king won't be annoying

    public boolean color;
    public int x, y;
    private Square[] legalMoves;

    public Piece(boolean color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Square[] getLegalMoves() {
        return legalMoves;
    }

    public void calculateLegalMoves() {}

}
