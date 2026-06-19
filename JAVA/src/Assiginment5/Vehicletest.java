package Assiginment5;

public class Vehicletest {

	public static void main(String[] args) {
		Car c=new Car("range rover",220,100,5);
		c.calculateMileage();
		c.display();
		
		Bike b=new Bike("trump",160,40,2);
		b.calculateMileage();
		b.display();
		

	}

}
