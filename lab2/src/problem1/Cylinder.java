package problem1;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	Cylinder() {
		radius = 0;
		height = 0;
	}
	
	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	@Override
	public double surfaceArea() {
		return 2 * Math.PI * radius * (height + radius);		
	}
	
	public String toString() {
		return "Cylinder";
	}
	
}
