package problem1;

public class Sphere extends Shape{
	private double radius;
	
	Sphere() {
		
	}
	
	Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double volume() {
		return (4 * Math.PI * Math.pow(radius, 3)) / 3;
	}

	@Override
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public String toString() {
		return "Sphere";
	}
}
