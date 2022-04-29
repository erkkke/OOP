package problem1;

public class Animal {
	protected String name;
	protected int age;
	protected String sound;

	public Animal() {
		name = "undefined";
		sound = "undefined";
		age = 0;
	}
	
	public Animal(String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.sound = sound;
	}
	
	public String showInfo() {
		return "Name: " + name + ", age: " + age + ", sound: " + sound;
	}
	
}
