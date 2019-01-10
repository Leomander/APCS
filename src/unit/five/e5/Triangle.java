package unit.five.e5;

public class Triangle implements Shape {
	
	private double a = 1;
	private double b = 1;
	private double c = 1;
	
	public Triangle() {}
	public Triangle(double a, double b, double c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public double area() {
		double s = 0.5 * (a+b+c);
		double in = s * (s-a)*(s-b)*(s-c);
		return Math.sqrt(in);
	}

	public double perimeter() {
		return a+b+c;
	}
	
}
