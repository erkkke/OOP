
public class Circle extends Shape {
	private double radius;
	private String symbol = "◯";
	
	public Circle(Color color, int pos, double radius) {
		super(color, pos);
		this.radius = radius;
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
	
	double getRadius() {
		return radius;
	}
	
	
}
