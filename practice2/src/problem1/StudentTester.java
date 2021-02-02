package problem1;

public class StudentTester {

	public static void main(String[] args) {
		Student student1 = new Student("Erkebulan", 19129);
		String name = student1.getName();
		int id = student1.getId();
		student1.setYearOfStudy(2);
		int year = student1.getYearOfStudy();
		
		System.out.print(name + " " + id + " " + year);
	}

}
