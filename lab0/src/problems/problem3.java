package problems;
import java.util.*;
public class problem3 {

	public static void main(String[] args) {
		String[] marks = {"F", "F", "F", "F", "F", "F", "F", "F", "F", "F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
		Scanner in = new Scanner(System.in);
		int points = in.nextInt();
		System.out.println("GPA: " + marks[(int)(Math.round(points / 5))]);

	}

}
