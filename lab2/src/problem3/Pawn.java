package problem3;

public class Pawn extends Piece {
	
	public Pawn() {
		super();
	}
	
	@Override
	public boolean isLegalMove(Position a, Position b) {
		return checkCoordinates(a,b) && a.posY >= 2 && a.posX == b.posX && b.posY - a.posY <= 2 && b.posY - a.posY >= 1;
	}
}
