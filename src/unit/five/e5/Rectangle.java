package unit.five.e5;

public class Rectangle implements Shape {
	
	private double width = 1;
	private double height = 1;
	
	public Rectangle() {}
	public Rectangle(int w, int h) {
		height = h;
		width = w;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	public void setHeight(double h) {
		height = h;
	}
	
	public double area() {
		return width * height;
	}

	public double perimeter() {
		return width*2 + height*2;
	}
	
}
