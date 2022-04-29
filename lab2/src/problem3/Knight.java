package problem3;

public class Knight extends Piece {
	
	public Knight() {
		super();
	}

	@Override
	public boolean isLegalMove(Position a, Position b) {
		return checkCoordinates(a, b) &&  ((Math.abs(a.posX - b.posX) == 2 && Math.abs(a.posY - b.posY) == 1) || (Math.abs(a.posX - b.posX) == 1 && Math.abs(a.posY - b.posY) == 2));
	}

}
