package problem1;

public class Student {
	String name;
	String id;
	int grade;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "Student's name: " + name + "\nID: " + id;
	}
}

