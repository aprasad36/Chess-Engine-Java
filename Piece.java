// Consider making this an abstract class.

public interface Piece {

    // Every Piece will need an isProtected boolean so that the king won't be annoying

    public Square[] getLegalMoves(Board b);

    // public void calculateLegalMoves();

    public Square[] influence(Board b);

    public String toString();

}
