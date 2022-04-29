package problem4;
import java.util.*;

import problem1.Student;

public class GradeBook {

	String maxiStudentName, miniStudentName, maxiStudentId, miniStudentId;
	
	Vector<Student> students = new Vector<Student>();
	Course course;
	
	GradeBook(String courseName, String courseDescription) {
		course = new Course(courseName, courseDescription);
	}
	
	void add(String name, String id) {
		students.add(new Student(name, id));
	}
	
	double determineClassAverage() {
		double sum = 0, avg;
		for(Student i: students) 
			sum += i.getGrade();
		avg = sum / students.size();
		
		return avg;
	}
	
	
	
	int determineClassMax() {
		int maxi = 0;
		for (Student i: students)
			if (i.getGrade() >= maxi) {
				maxi = i.getGrade();
				maxiStudentName = i.getName();
				maxiStudentId = i.getId();
			}
		return maxi;
	}
	
	int determineClassMin() {
		int mini = 100;
		for (Student i: students)
			if (i.getGrade() <= mini) {
				mini = i.getGrade();
				miniStudentName = i.getName();
				miniStudentId = i.getId();
			}
		return mini;
	}
	
	void gradesDistribution() {

		String[] grades = new String[11];
		Arrays.fill(grades, "");
		
		for (Student i: students)
			grades[i.getGrade() / 10] += "*";
		
		System.out.println("\nGrades distribution:");
		for (int i = 0; i < 10; i++) {
			System.out.println(i * 10 + "-" + (i * 10 + 9) + ": " + grades[i]);
		}
		System.out.println(100 + ": " + grades[10]);
	}
	void displayMessage() {
		System.out.println("Welcome to the grade book for " + course + "!\n\n" + 
	"Please, input grades for students: \n");
	}
		
	void displayGradeReport() {
		System.out.println("Class average is " + determineClassAverage() + ".");
		System.out.println("Lowest grade is " + determineClassMin() + "(" + miniStudentName + ", id: " + miniStudentId + ").");
		System.out.println("Highest grade is " + determineClassMax() + "(" + maxiStudentName + ", id: " + maxiStudentId + ").");
	}
	
	public String toString() {
		for (Student i: students) {
			return i.getName() + ": " + i.getGrade();
		}
		return "";
	}

}
