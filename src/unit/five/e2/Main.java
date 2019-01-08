package unit.five.e2;

import unit.five.Car;
import unit.five.Truck;
import unit.five.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		System.out.println("Vehicle plate: "+v.getLicense());
		
		for (int i = 0; i < 3; i++) {
			Car c = new Car();
			System.out.println("Car "+i+" plate: "+c.getLicense());
		}
		
		for (int i = 0; i < 3; i++) {
			Truck t = new Truck();
			System.out.println("Truck "+i+" plate: "+t.getLicense());
		}
		
	}
	
}
