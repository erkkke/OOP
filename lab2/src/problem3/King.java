package problem3;

public class King extends Piece {
	
	public King() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		return checkCoordinates(a, b) && Math.abs(a.posX - b.posX) <= 1 && Math.abs(a.posY - b.posY) <= 1;
	}
}
