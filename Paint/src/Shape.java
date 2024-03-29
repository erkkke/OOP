
public abstract class Shape {
	protected Color color;
	protected int pos;
	
	public Shape() {
		
	}
	
	public Shape(Color color, int pos) {
		this.color = color;
		this.pos = pos;
	}
	
	abstract void draw();
	
	protected String locate(String symbol) {
		String s = "";
		for (int i = 0; i < pos; i++)
			s += " ";
		return s + symbol;
	}
}
