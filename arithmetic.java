package source;

import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Enter a: ");
			int a = inp.nextInt();
			System.out.println("Enter b: ");
			int b = inp.nextInt();
			System.out.println("Sum of a and b is:" + add(a,b));
			System.out.println("Product of a and b is:" + multiply(a,b));
			System.out.println("Difference a - b is:" + sub(a,b));
			System.out.println("Quotient of a/ b is:" + divide(a,b));
			System.out.println("Remainder of a/ b is:" + rem(a,b));}
		
	}
	public static int 	add(int a, int b) {
		return a+b;
	}
	public static int 	sub(int a, int b) {
		return a-b;
	}
	public static int 	multiply(int a, int b) {
		return a*b;
	}
	public static int 	divide(int a, int b) {
		return a/b;
	}
	public static int 	rem(int a, int b) {
		return a%b;
	}
}
