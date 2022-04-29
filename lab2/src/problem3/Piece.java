package problem3;

public abstract class Piece {
	
	public Piece() {}
	
	public abstract boolean isLegalMove(Position a, Position b);
	
	public boolean checkCoordinates(Position a, Position b) {
		return a.posX != b.posX || a.posY != b.posY;
	}
}
