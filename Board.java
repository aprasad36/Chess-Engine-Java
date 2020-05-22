public class Board {
    // Chess board is 8x8
    // Coordinates start at 1 and end at 8
    public Square[][] boardList;

    public Board() {
        this.boardList = new Square[8][8];
        for (int i = 0; i < boardList.length; i++) {
            for (int j = 0; j < boardList[0].length; j++) {
                boardList[i][j] = new Square(i + 1, j + 1);
            }
        }

    }

    public Square getSquare(int x, int y) {
        return boardList[8-y][x-1];
    }

    // For Testing
    public String showInfluence(Piece p) {
        String retString = "";
        Square[] bList = p.influence(this);
        for (int i = 0; i < boardList.length; i++) {
            for (int j = 0; j < boardList[0].length; j++) {
                if (boardList[i][j].squareInArray(bList)) {
                    retString += p.toString() + "i ";
                } else {
                    retString += boardList[i][j].toString();
                }
            }
            retString += "\n";
        }
        return retString;
    }

    public String toString() {
        String retString = "";
        for (int i = 0; i < boardList.length; i++) {
            for (int j = 0; j < boardList[0].length; j++) {
                retString += boardList[i][j].toString();
            }
            retString += "\n";
        }
        return retString;
    }

    // THIS DOESN'T WORK YET
    public boolean isLegalPosition() {
        return true;
    }
    // getAdjacentTiles, getRank, getFile, and getDiagonals might be helpful methods.

    // public Square[] getRank(Square current) {
    //     for (int i = 0; i < 8; i++) {
    //
    //     }
    //     Square[] returnarr = boardList[current.x][:]
    // }

}
