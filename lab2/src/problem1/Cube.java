package problem1;

public class Cube extends Shape {

	private double edgeLength;
	
	Cube() {
		edgeLength = 0;
	}
	
	Cube(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	
	@Override
	public double volume() {
		return Math.pow(edgeLength, 3);
	}

	@Override
	public double surfaceArea() {
		return 6 * Math.pow(edgeLength, 2);
	}
	
	public String toString() {
		return "Cube";
	}

}
