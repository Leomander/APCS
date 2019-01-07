package unit.five.one;

public class Vehicle {
	
	private int speed = 0;
	
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
	public void increaseSpeed() {
		speed++;
	}
	public void decreaseSpeed() {
		speed--;
	}
	
	
}
