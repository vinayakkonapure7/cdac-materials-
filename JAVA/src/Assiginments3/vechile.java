package Assiginments3;

class vechile {
	static String brand="BMW";
	double price;
	public vechile(double price) {
		this.price = price;
	} 
	
}

class Car extends vechile{
	double mileage;

	public Car(double price,double mileage) {
		super(price);
		this.mileage=mileage;
		
	}
	
	void resale() {
		double amount=price-(price*0.20);
		System.out.println("Resale price is: "+amount);
	}
	
	void displaycar() {
		System.out.println("brand: "+brand+"\nprice: "+price+"\nmileage: "+mileage);
	}

	
}

class Bike extends vechile{
	int engineCapacity;

	public Bike(double price,int engineCapacity) {
		super(price);
		this.engineCapacity=engineCapacity;
		
		
	}
	void insurance() {
		double iamount=price+(price*0.05f);
		System.out.println("including insurance amount: "+iamount);
	}
	
	void displarbike() {
		System.out.println("brand: "+brand+"\nprice: "+price+"\nengineCapacity: "+engineCapacity);
	}
	
}