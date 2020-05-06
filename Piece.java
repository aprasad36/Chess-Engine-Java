// Consider making this an abstract class.

public interface Piece {

    // Every Piece will need an isProtected boolean so that the king won't be annoying

    public Piece();

    public Piece(boolean color, int x, int y);

    public Square[] getLegalMoves();

    public void calculateLegalMoves();

    public String toString();

}