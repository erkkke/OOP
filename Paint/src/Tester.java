import java.util.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		Vector<Shape> shapes = new Vector<Shape>();
		shapes.add(new Circle(Color.RED, 3, 1.1));
		shapes.add(new Rectangle(Color.BLACK, 5));
		shapes.add(new Triangle(Color.RED, 10));
		Circle.radius
		
//		for (Shape i: list) {
//			if (i instanceof Circle) {
//				Circle circle = (Circle)i;
//				System.out.print(circle.getRadius());
//				System.out.println();
//				
//				circle.draw();
//				System.out.println();
//				
//				circle.draw(4);
//				System.out.println();
//			}
//			else if (i instanceof Rectangle) {
//				Rectangle rect = (Rectangle)i;
//				
//				rect.draw();
//				System.out.println();
//				
//				rect.draw(2);
//				System.out.println();
//			}
//			else {
//				Triangle tr = (Triangle)i;
//				tr.draw();
//				System.out.println();
//				
//				tr.draw(5);
//				System.out.println();
//			}
//		}
		
		for (Shape i: shapes) {
			i.draw();
			System.out.println();
			Thread.sleep(500);
		}
	}

}
