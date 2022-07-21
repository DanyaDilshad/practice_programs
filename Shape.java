package source;

public interface Shape {
	void area();
	void perimeter();
}

class circle implements Shape{
	
	private int radius;
		
	public circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		double ar;
		ar = 3.14 * this.getRadius() * this.getRadius();
		System.out.println("Circle Area is " + ar + "sq. units");
		
	}

	@Override
	public void perimeter() {
		double c;
		c = 2*3.14*this.getRadius();
		System.out.println("Circle Circumference is " + c + "units");
		
		
	}
	
}

class rectangle implements Shape{
	private int length,breadth;

	
	public rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void area() {
		int ar;
		ar = this.getBreadth() * this.getLength();
		System.out.println("Rectangle Area is " + ar+ "sq. units");
	}

	@Override
	public void perimeter() {
		int p;
		p = 2 * (this.breadth + this.length);
		System.out.println("Rectangle Perimeter is " + p + "units");
	}
	
}


class square implements Shape{
	private int length;

	
	public square(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}



	@Override
	public void area() {
		int ar;
		ar = this.getLength() * this.getLength();
		System.out.println("Square Area is " + ar + "sq. units");
	}

	@Override
	public void perimeter() {
		int p;
		p = 4 * this.length;
		System.out.println("Square Perimeter is " + p + "units");
	}
	
}

class rightTriangle implements Shape{

	int base, height;
	
	
	public rightTriangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		
		float ar;
		ar = (float) (0.5 * base * height);
		System.out.println("Right-Angle Triangle Area is " + ar + "sq. units");
	}

	@Override
	public void perimeter() {
		
		float hyp,p;
		int a2 = base*base;
		int b2 = height*height;
		hyp = (float) Math.sqrt(a2+b2);
		p = hyp + base + height;
		System.out.println("Right-Angle triangle Perimeter is:" + p + "units");
	}
	

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
