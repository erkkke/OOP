package CompareExample;

public class Laptop implements Comparable<Laptop>{
	String name;
	int price;
	
	
	
	public Laptop() {
		
	}
	
	public Laptop(String name ,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "[name: " + name + ", price: " + price + "]";
	}
	
	@Override
	public int compareTo(Laptop o) {
		if (price > o.price) return 1;
		else if (price < o.price) return -1;
		return 0;
	}
	
}
