package Hashmap;

public class CartItem {
	int productId ;
	String productName;
	double price;
	int quantity;
	
	static int productcount=0;

	public CartItem(String productName, double price, int quantity) {
		productcount++;
		this.productId = productcount;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	void displayItemDetails() {
		System.out.println("----- CART ITEM DETAILS -----");
		System.out.println("productId: "+productId);
		System.out.println("productName: "+productName);
		System.out.println("price: "+price);
		System.out.println("quantity: "+quantity);
		
	}
	

}
