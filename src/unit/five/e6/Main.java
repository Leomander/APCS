package unit.five.e6;

import unit.five.Car;
import unit.five.Truck;
import unit.five.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle[] vls = {new Vehicle(), new Car(), new Truck()};
		
		for (Vehicle v:vls) {
			if (v instanceof Vehicle) {
				System.out.printf("%s is a vehicle instance\n",v);
			}
			if (v instanceof Car) {
				System.out.printf("%s is a car instance\n",v);
			}
			if (v instanceof Truck) {
				System.out.printf("%s is a truck instance\n", v);
			}
			System.out.println();
		}
		
	}
	
}
