package unit.five.e3;

import unit.five.Truck;

public class Main {
	
	public static void main(String[] args) {
		
		Truck t = new Truck();
		
		System.out.println("Speed: "+ t.getSpeed());
		
		t.setSpeed(25);
		System.out.println("Speed: "+ t.getSpeed());
		
		t.setSpeed(60);
		System.out.println("Speed: "+ t.getSpeed());
		
		t.setSpeed(100);
		System.out.println("Speed: "+ t.getSpeed());
		
		t.setSpeed(75);
		System.out.println("Speed: "+ t.getSpeed());
		
	}
	
}
