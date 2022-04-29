package problem3;

public class TesterChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Position a = new Position("e4");
		Position b = new Position("e5");
		
		Piece pawn = new Pawn();
		Piece bishop = new Bishop();
		Piece knight = new Knight();
		Piece queen = new Queen();
		Piece king = new King();
		Piece rook = new Rook();
		System.out.println(pawn.isLegalMove(a,b));
	}

}
