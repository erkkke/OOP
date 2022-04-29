package problem2;

public class Person {
	String name, address;
	
	Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	String getName() {
		return name;
	}
	
	String getAddress() {
		return address;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Name: " + name + ", address: " + address;
	}
}
