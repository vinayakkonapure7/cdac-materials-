package Assiginment5;



abstract public class Vehicle {
	String vehicleName;
	int speed;
	public Vehicle(String vehicleName, int speed) {
		super();
		this.vehicleName = vehicleName;
		this.speed = speed;
	} 
	abstract double calculateMileage();
	
	void display() {
		System.out.println("vehicleName: "+vehicleName+"\nspeed: "+speed);
	}

}
class Car extends Vehicle{
	int distance;
	int fuel;

	public Car(String vehicleName, int speed,int fuel,int distance) {
		super(vehicleName, speed);
		this.fuel=fuel;
		this.distance=distance;
	}
	double calculateMileage() {
		double cal=fuel/distance;
		System.out.println("the Mileage is:  "+cal);
		return cal;
		
	}
	
}

class Bike extends Vehicle{
	int distance;
	int fuel;

	public Bike(String vehicleName, int speed,int fuel,int distance) {
		super(vehicleName, speed);
		this.fuel=fuel;
		this.distance=distance;
	}
	double calculateMileage() {
		double cal=fuel/distance;
		System.out.println("the Mileage is:  "+cal);
		return cal;
		
	}
	
}

