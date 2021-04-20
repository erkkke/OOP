package problem2;

public class Bee implements Flyable {
	
	public Bee() {}

	@Override
	public void move() {
		System.out.println("Bee is crawling");
	}

	@Override
	public void fly() {
		System.out.println("Bee is flying");
	}
	
}
