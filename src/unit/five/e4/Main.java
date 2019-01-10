package unit.five.e4;

public class Main {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.printf("| %S | Maxspeed:%d Mileage:%f Weight:%d\n",c.toString(),c.getMaxSpeed(),c.getGasMileage(),c.getWeight());
		
		Truck t = new Truck();
		System.out.printf("| %S | Maxspeed:%d Mileage:%f Weight:%d\n",t.toString(),t.getMaxSpeed(),t.getGasMileage(),t.getWeight());
		
	}
	
}
