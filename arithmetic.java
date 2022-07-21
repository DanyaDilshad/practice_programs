package source;

import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Enter a: ");
			int a = inp.nextInt();
			System.out.println("Enter b: ");
			int b = inp.nextInt();
			System.out.println("Sum of a and b is:" + (a+b));
			System.out.println("Product of a and b is:" + (a*b));
			System.out.println("Difference a - b is:" + (a-b));
			System.out.println("Quotient of a/ b is:" + (a/b));
			System.out.println("Remainder of a/ b is:" + (a%b));
		}
		
	}
}
