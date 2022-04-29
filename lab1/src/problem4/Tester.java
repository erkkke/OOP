package problem4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		GradeBook gb = new GradeBook("CS101", "Object-oriented Programming and Design");
		gb.add("Student A", "1");
		gb.add("Student B", "2");
		gb.add("Student C", "3");
		gb.add("Student D", "4");
		gb.add("Student E", "5");
		
		gb.displayMessage();
		
		for (int i = 0; i < gb.students.size(); i++) {
			System.out.println(gb.students.get(i).getName() + ":   ");
			int grade = in.nextInt();
			gb.students.get(i).setGrade(grade);
		}
		
		
		gb.displayGradeReport();
		gb.gradesDistribution();
	}

}
