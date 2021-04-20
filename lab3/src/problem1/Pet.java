package problem1;

public abstract class Pet {
	String name;
	int age;
	
	public Pet() {}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	abstract void sound();
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "name: " + name + ", age: " + age;
	}
}
