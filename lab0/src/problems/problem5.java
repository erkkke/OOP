package problems;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                System.out.println("Not Palindrome");
                return;
            }
            l++; 
            r--;
        }

        System.out.println("Palindrome");
    }    
}
