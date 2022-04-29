package problem3;

public class Position {
	int posX;
	int posY;
	
	public Position() {}
	
	public Position(String s) {
		posX = Character.toUpperCase(s.charAt(0)) - 'A' + 1;
		posY = (s.charAt(1) - '0');
		checkPosition();
	}
	
	private void checkPosition() {
		if (posY < 1 || posY > 8 || posX < 1 || posX > 8) {
			System.out.print("Uncorrect coordinates");
			System.exit(0);
		}
	}
	
	public String getPosition() {
		return Character.toString((char)(posY + 'A')) + (posX + 1);
	}
	
	
}
