package unit.five.e5;

public class Main {

	public static void main(String[] args) {
		
		Shape[] shapes = {new Circle(3), new Rectangle(3, 4), new Triangle(3, 4, 5)};
	
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("%S: A=%f P=%f\n", shapes[i].toString(), shapes[i].area(), shapes[i].perimeter());
		}
		
	}
	
}
