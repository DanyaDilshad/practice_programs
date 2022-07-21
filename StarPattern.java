package source;

import java.util.Scanner;

public class StarPattern {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = inp.nextInt();
		int i,j;
		for (i=0; i<n; i++) {
			for(j=0; j<n-i;j++) {
				System.out.print(" ");
			}
			for (j = 0; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (i=n; i>0; i--) {
			for(j=n-i; j>=0;j--) {
				System.out.print(" ");
			}
			for (j = i; j>=0; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		  
	}
}
