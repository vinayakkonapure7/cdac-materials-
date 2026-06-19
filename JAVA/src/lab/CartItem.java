package lab;

public class CartItem {
	private int productId;
	public String productName;
	public double price;
	public int quantity;
	
	public static int productCount = 0;
	
	public CartItem(String productName, double price, int quantity) {
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		 productCount++;
		this.setProductId(productCount);
	}
	
	public void displayItemDetails() {
		System.out.println("----- CART ITEM DETAILS -----");
		System.out.println("productId: "+getProductId());
		System.out.println("productName: "+productName);
		System.out.println("price: "+price);
		System.out.println("quantity: "+quantity);
		
	}

	public int getProductId() {
		return productId;
	}



}
