package problem1;

public class Car implements Moveable {
	String brand;
	
	public Car() {}
	
	public Car(String brand) {
		this.brand = brand;
	}

	public void move() {
		System.out.println("Car is moving");		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String toString() {
		return "Brand: " + brand;
	}
	
}
