package unit.five;

public class Truck extends Car {
	
	private static final int MAX_SPEED = 75;
	
	private static int licenseCount = 2;
	
	public Truck() {
		setLicense("T"+licenseCount);
		Truck.licenseCount+=2;
	}
	
	public void setSpeed(int speed) {
		if (speed <= MAX_SPEED) {
			super.setSpeed(speed);
		}
	}
	
	public void openTailgate() {
		System.out.println("Opening tailgate");
	}
	public void closeTailgate() {
		System.out.println("Closing tailgate");
	}
	
	public int getMaxSpeed() {
		return MAX_SPEED;
	}
	public double getGasMileage() {
		return 40.6;
	}
	public int getWeight() {
		return 4300;
	}
	
}
