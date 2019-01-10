package unit.five.e4;

public class Car extends Vehicle {
	
	private static int licenseCount = 1;
	
	public Car() {
		setLicense("C"+licenseCount);
		Car.licenseCount+=2;
	}
	
	public void openTrunk() {
		System.out.println("Opening trunk");
	}
	public void closeTrunk() {
		System.out.println("Closing trunk");
	}

	public int getMaxSpeed() {
		return 120;
	}
	public double getGasMileage() {
		return 60;
	}
	public int getWeight() {
		return 1200;
	}

}
