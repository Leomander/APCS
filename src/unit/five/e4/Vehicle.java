package unit.five.e4;

public abstract class Vehicle {
	
	private int speed = 0;
	private String licensePlate = null;
	
	public void start() {
		System.out.println("Starting");
	}
	public void stop() {
		System.out.println("Stopping");
	}
	public void turn() {
		System.out.println("Turning");
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getLicense() {
		return licensePlate;
	}
	public void setLicense(String license) {
		licensePlate = license;
	}
	
	public void increaseSpeed() {
		speed++;
	}
	public void decreaseSpeed() {
		speed--;
	}
	
	public abstract int getMaxSpeed();
	public abstract double getGasMileage();
	public abstract int getWeight();	
	
}
