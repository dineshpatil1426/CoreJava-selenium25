package oops_concept;

class Vehicle{
	
	private int speed1;
	
	public void speedUp() {
		speed1=speed1+10;
	}
	
	public int getSpeed() {
		return speed1;
	}
}

class Car extends Vehicle{
	
	public void speedUp() {
		super.speedUp();
		System.out.println("\nCar speed increased by 22 units.");
	}
}

class Motorcycle extends Vehicle{
	
	public void speedUp() {
		super.speedUp();
		System.out.println("Motorcycle speed increased by 12 units");
	}
}


public class Polymorphism2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		Motorcycle motorcycle = new Motorcycle();
		
		System.out.println("Car initial speed: " + car.getSpeed());
		System.out.println("Motorcycle initial speed: " + motorcycle.getSpeed());
		
		car.speedUp();
		motorcycle.speedUp();
		
		System.out.println("\nCar speed after speeding up: " + car.getSpeed());
		System.out.println("Motorcycle speed after speeding up: " + motorcycle.getSpeed());

	}

}
