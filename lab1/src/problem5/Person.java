package problem5;

public class Person {
	Gender gender = Gender.GIRL;
	
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	Gender getGender() {
		return gender;
	}
	
	public String toString() {
		return gender.toString();
	}
}
