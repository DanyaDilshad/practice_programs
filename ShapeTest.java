package source;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		
		try (Scanner inp = new Scanner(System.in)) {
			System.out.println("Select the shape: 1. Circle 2.Rectangle 3. Square 4. Right-Angle Triangle");
			int choice = inp.nextInt();
			switch(choice) {
				case 1: implementCircle();
					break;
				case 2: implementRectangle();
				break;
				case 3: implementSquare();
				break;
				case 4: implementTriangle();
				break;
				default: System.out.println("Give Valid input!");
			}
		}	
	}
	
	public static void implementCircle(){
		try(Scanner inp = new Scanner(System.in)){
			System.out.println("Give radius of circle");
			int r = inp.nextInt();
			circle c = new circle(r);
			c.area();
			c.perimeter();
		}
	}
	
	
	public static void implementRectangle(){
		try(Scanner inp = new Scanner(System.in)){
			System.out.println("Give length of rectangle");
			int l = inp.nextInt();
			System.out.println("Give breadth of rectangle");
			int b = inp.nextInt();
			rectangle r = new rectangle(l,b);
			r.area();
			r.perimeter();
		}
	}
	
	
	public static void implementSquare(){
		try(Scanner inp = new Scanner(System.in)){
			System.out.println("Give side of square");
			int l = inp.nextInt();
			square r = new square(l);
			r.area();
			r.perimeter();
		}
	}
	
	public static void implementTriangle(){
		try(Scanner inp = new Scanner(System.in)){
			System.out.println("Give base of right-angle triangle");
			int l = inp.nextInt();
			System.out.println("Give height of right-angle triangle");
			int b = inp.nextInt();
			rightTriangle r = new rightTriangle(l,b);
			r.area();
			r.perimeter();
		}
	}
}
