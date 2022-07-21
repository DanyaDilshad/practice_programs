package source;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		int c = 0;
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Enter number to check if prime or no:");
			int n = inp.nextInt();
			for(int i = 2; i<n/2; i++) {
				if(n%i ==0) {
					c =1;
					break;
				}
			}
		}
		if(c==0) System.out.println("Prime");
		else System.out.println("Not Prime");
	}
}
