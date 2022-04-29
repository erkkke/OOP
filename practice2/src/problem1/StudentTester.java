package problem1;

public class StudentTester {

	public static void main(String[] args) {
		Student student1 = new Student("Erkebulan", "19BD");
		String name = student1.getName();
		String id = student1.getId();
		student1.setGrade(2);
		int grade = student1.getGrade();
		
		System.out.print(name + " " + id + " " + grade);
	}

}
