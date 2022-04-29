package problem1;

import java.util.Scanner;

public class Analyzer {

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		Data data = new Data();
		
		while (true) {
			try { 
				System.out.print("Enter number (Q to quit): ");
				double number = in.nextDouble();
				data.add(number); 
			}
			catch (Exception e) {
				break;
			}
		}
		
		System.out.println("Average = " + data.getAverage() + "\nMaximum = " + data.getMaxi());
	}

}
