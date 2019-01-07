package unit.five.one;

public class Main {

	public static void main(String[] args) {
		
		// ---------------------------------------------------- //
		
		System.out.println("\nVehicle A: ");
		Vehicle a = new Vehicle();
		a.setSpeed(35);
		System.out.println(a.getSpeed());
		// next two lines don't work because they aren't vehicle methods. This is true for all Vehicle objects.
		//a.openTrunk();
		//a.openTailgate();
		a.turn();
		a.stop();
		
		System.out.println("\nVehicle B: ");
		Vehicle b = new Car();
		b.setSpeed(35);
		System.out.println(b.getSpeed());
		//b.openTrunk();
		//b.openTailgate();
		b.turn();
		b.stop();
		
		System.out.println("\nVehicle C: ");
		Vehicle c = new Truck();
		c.setSpeed(35);
		System.out.println(c.getSpeed());
		//c.openTrunk();
		//c.openTailgate();
		c.turn();
		c.stop();
		
		// ---------------------------------------------------- //
		
		System.out.println("\nCar AA: ");
		// you cannot cast a vehicle to a car.
		//Car aa = new Vehicle();
		//aa.setSpeed(35);
		//System.out.println(aa.getSpeed());
		//aa.openTrunk();
		//aa.openTailgate();
		//aa.turn();
		//aa.stop();
		
		System.out.println("\nCar BB: ");
		Car bb = new Car();
		bb.setSpeed(35);
		System.out.println(bb.getSpeed());
		bb.openTrunk();
		//bb.openTailgate();
		bb.turn();
		bb.stop();
		
		System.out.println("\nCar CC: ");
		Car cc = new Truck();
		cc.setSpeed(35);
		System.out.println(cc.getSpeed());
		cc.openTrunk();
		//cc.openTailgate();
		cc.turn();
		cc.stop();
		
		// ---------------------------------------------------- //
		
		System.out.println("\nTruck AAA: ");
		//Truck aaa = new Vehicle();
		//aaa.setSpeed(35);
		//System.out.println(aaa.getSpeed());
		//aaa.openTrunk();
		//aaa.openTailgate();
		//aaa.turn();
		//aaa.stop();
		
		System.out.println("\nTruck BBB: ");
		//Truck bbb = new Car();
		//bbb.setSpeed(35);
		//System.out.println(bbb.getSpeed());
		//bbb.openTrunk();
		//bbb.openTailgate();
		//bbb.turn();
		//bbb.stop();
		
		System.out.println("\nTruck CCC: ");
		Truck ccc = new Truck();
		ccc.setSpeed(35);
		System.out.println(ccc.getSpeed());
		ccc.openTrunk();
		ccc.openTailgate();
		ccc.turn();
		ccc.stop();
		
	}
	
}
