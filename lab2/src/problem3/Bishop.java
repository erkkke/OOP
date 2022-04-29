package problem3;

public class Bishop extends Piece {
	public Bishop() {
		super();
	}
	
	@Override
	public boolean isLegalMove(Position a, Position b) {
		return checkCoordinates(a, b) && Math.abs(a.posX - b.posX) == Math.abs(a.posY - b.posY);
	}
	
}
