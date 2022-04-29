package problem3;

public class Rook extends Piece {
	
	public Rook() {
		super();
	}
	
	@Override
	public boolean isLegalMove(Position a, Position b) {
		return checkCoordinates(a,b) && (a.posX == b.posX || a.posY == b.posY);
	}
}
