public class testChess {
    public static void main(String[] args) {
        Board b = new Board();
        Rook r1 = new Rook(true, b.getSquare(4,4));
        Rook r2 = new Rook(false, b.getSquare(4,6));

        System.out.println(b);

    }
}
