package problem2;

import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> persons = new Vector<Person>();
		persons.add(new Person("Eren", "Shiganshina"));
		persons.add(new Student("Levi", "Wall Rose", "FIT", 4, 203.23));
		persons.add(new Staff("Mikasa", "Shiganshina", "62", 2343));
		
		for (Person i: persons) {
			System.out.println(i);
		}
		
	}

}
