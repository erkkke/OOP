package problems;

import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double determinant = b * b - 4 * a * c;
        double sqrt = Math.sqrt(determinant);
        if (determinant > 0) {
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root = (-b + sqrt) / (2 * a);
            System.out.println("Root is: " + root);
        }
        else 
            System.out.println("Error, determinant is negative value!");
    }
}