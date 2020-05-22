public class Square {

    public boolean isOccupied;
    public Piece occupiedBy;
    public int x, y;
    public boolean isProtectedWhite;
    public boolean isProtectedBlack;

    public Square() {
        this.isOccupied = false;
        this.x = -1;
        this.y = -1;
    }

    public Square(int x, int y) {
        this.isOccupied = false;
        this.x = x;
        this.y = y;
    }


    public boolean squareInArray(Square[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (this == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public Square(int x, int y, Piece occupiedBy) {
        this.isOccupied = true;
        this.occupiedBy = occupiedBy;
        this.x = x;
        this.y = y;
    }

    public void setCoords(int x, int y) {
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

    public String toString() {
        if (this.isOccupied) {
            return " " + occupiedBy.toString() + " ";
        } else {
            return " _ ";
        }
    }

}
