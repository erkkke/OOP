package problem1;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> shapes = new Vector<Shape>();
		
		shapes.add(new Cylinder(4, 6));
		shapes.add(new Sphere(4));
		shapes.add(new Cube(4));
		
		for (Shape shape: shapes) {
			System.out.println(shape);
			System.out.println("Volume: " + shape.volume());
			System.out.println("Surface area: " + shape.surfaceArea() + "\n");
		}
	}

}
