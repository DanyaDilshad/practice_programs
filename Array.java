package source;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public static void main(String args[]) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Give number of items to append in list:");
			int n = sc.nextInt();
			for(int i =0; i<n; i++) {
				System.out.print("Give String to append in list:");
				String s = sc.next();
				list.add(s);
			}
		}
		System.out.println("The string list is" + list);
	}
}
