package problem1;

public class Dog extends Pet implements Moveable {
	String bread;
	
	public Dog(String name, int age, String bread) {
		super(name, age);
		this.bread = bread;
	}
	
	void sound() {
		System.out.println("gaf");
	}
	
	@Override
	public void move() {
		System.out.println("Dog is running");
	}
	
	public String getBread() {
		return bread;
	}
	
	public String toString() {
		return "Dog's " + super.toString() + ", bread: " + bread;
	}


}
