package Assiginment4;

import java.util.Scanner;

class Transport {
	double distance ;


	public Transport(double distance) {
		
		this.distance = distance;
	}
	void calculateFare() {
		System.out.println("the fre accourding to distance is:"+distance);
	}



	public static void main(String[] args) {
		while(true) {
			Scanner s= new Scanner(System.in);
			System.out.println("enter the travel mode \n 1.bus \n 2.train \n 3.taxi \n 4.exit");
			System.out.println("enter choice: ");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				Bus b=new Bus(10);
				b.calculateFare();
				break;
			case 2:
				Train t=new Train(50);
				t.calculateFare();
				break;
			case 3:
				Taxi ta=new Taxi(5);
				ta.calculateFare();
				break;
			case 4:
				System.out.println("exit");
				return;
			default:
				System.out.println("invalid choice");
			}
		}
	

	}

}

class Bus extends Transport{
	int fare=5;

	public Bus(double distance) {
		super(distance);
	}
	
	void calculateFare() {
		distance=distance*fare;
		System.out.println("the fair of bus is: "+distance);
	}
	
}

class Train extends Transport{
	int fare=3;

	public Train(double distance) {
		super(distance);
	}
	
	void calculateFare() {
		distance=distance*fare;
		System.out.println("the fair of bus is: "+distance);
	}
	
}

class Taxi extends Transport{
	int fare=12;

	public Taxi(double distance) {
		super(distance);
	}
	
	void calculateFare() {
		distance=50+(distance*fare);
		System.out.println("the fair of bus is: "+distance);
	}
	
}