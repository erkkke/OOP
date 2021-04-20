package problem4;

public class Person {
	protected String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	
	public boolean equals(Object o) {
		if (this == o) 
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;
		Person p = (Person) o;
		return name.equals(p.name);
	}
	
}
