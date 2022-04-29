package problem1;

public class Dog extends Animal{
	String breed;
	public Dog() {
		super();
		breed = "undefined";
	}
	
	public Dog(String name, int age, String sound, String breed) {
		super(name, age, sound);
		this.breed = breed;
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + ", breed: " + breed;
	}
	
	public String showInfo(boolean showOnlyBreed) {
		if (showOnlyBreed)
			return "Breed: " + breed;
		
		return this.showInfo();
	}
	
	
}
