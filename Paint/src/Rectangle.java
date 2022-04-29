
public class Rectangle extends Shape{
	private String symbol = "▯";
	
	public Rectangle(Color color, int pos) {
		super(color, pos);
	}

	@Override
	void draw() {
		if (color == Color.BLACK)
			System.out.print(locate(symbol));
		else if (color == Color.RED)
			System.err.print(locate(symbol));
	}
	
	void draw(int n) {
		for (int i = 0; i < n; i++) 
			draw();
	}
	
}
