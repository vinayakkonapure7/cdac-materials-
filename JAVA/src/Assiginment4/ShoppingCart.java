package Assiginment4;

public class ShoppingCart {
	double price ;


	public ShoppingCart(double price) {
		
		this.price = price;
	}
	
	void calculateBill(double price) {
		System.out.println("price: "+price);
	}
	
	void calculateBill(double price,int quantity) {
		double total=price*quantity;
		System.out.println("total bill is"+total);
		
	}
	
	void calculateBill(double price, int quantity, double discount) {
		double total=price*quantity;
		double appliedis=total-(total*discount);
		System.out.println("total bill is "+total+"\n after applied discount: "+appliedis);
				
	}


	public static void main(String[] args) {
	ShoppingCart sc=new ShoppingCart (1000);
	//single line
	sc.calculateBill(1000);
	//double line
	sc.calculateBill(1000,10);
	//third line
	sc.calculateBill(1000,10,0.10);

	}
	
	

}
