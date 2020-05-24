// Consider making this an abstract class.

public interface Piece {

    // Every Piece will need an isProtected boolean so that the king won't be annoying

    public Square[] getLegalMoves(Board b);

    public boolean getColor();
    // public void calculateLegalMoves();

    public Square[] influence(Board b);

    public String toString();

    public int move(Board b, Square s);

}
