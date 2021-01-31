package problems;

import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		int n = name.length();
		for (int i = 0; i < 3; i++) {
			System.out.print((i == 1) ? '|' : '+');
			for (int j = 0; j < n; j++) {
				if (i == 1) {
					System.out.print(name);
					break;
				}
				else 
					System.out.print('-');
			}
			
			System.out.print((i == 1) ? "|\n" : "+\n");
		}
	}

}
