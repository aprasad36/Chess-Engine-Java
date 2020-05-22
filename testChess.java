public class testChess {
    public static void main(String[] args) {
        Board b = new Board();
        Rook r1 = new Rook(true, b.getSquare(4,4));
        Rook r2 = new Rook(true, b.getSquare(3,4));
        Rook r3 = new Rook(true, b.getSquare(5,4));
        Rook r4 = new Rook(true, b.getSquare(4,3));
        Rook r5 = new Rook(true, b.getSquare(4,5));
        // Square[] s = new Square[4];
        // for (int i = 0; i < s.length; i++) {
        //     s[i] = new Square(i, i);
        // }
        // System.out.println(b);
        System.out.println(b.showInfluence(r1));
        // System.out.println(r.x);
        // System.out.println(r.y);
    }
}
