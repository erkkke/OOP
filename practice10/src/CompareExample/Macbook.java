package CompareExample;

public class Macbook extends Laptop {
	String cpu;
	
	public Macbook( ) {}
	
	public Macbook(String name, int price, String cpu) {
		super(name, price);
		this.cpu = cpu;
	}
	
	public int compareTo(Laptop obj) {
		Macbook m = (Macbook) obj;
		if (super.compareTo(m) == 0)
			return cpu.compareTo(m.cpu);
		return super.compareTo(m);
	}
	
	public String toString() {
		return super.toString() + ", cpu: " + cpu + "]";
	}
}
