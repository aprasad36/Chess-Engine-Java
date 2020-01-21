public class Square {

    public boolean isOccupied;
    public Piece occupiedBy;
    public int x, y;
    public boolean isProtectedWhite;
    public boolean isProtectedBlack;


    public Square(int x, int y) {
        this.isOccupied = false;
        this.x = x;
        this.y = y;
    }

    public Square(int x, int y, Piece occupiedBy) {
        this.isOccupied = true;
        this.occupiedBy = occupiedBy;
        this.x = x;
        this.y = y;
    }

    public void occupy(Piece p) {
        isOccupied = true;
        occupiedBy = p;
    }

    public void leave() {
        isOccupied = false;
        occupiedBy = null;
    }

}
