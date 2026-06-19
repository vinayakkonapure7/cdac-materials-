package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartSystem {
	static ArrayList<CartItem> obj=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	public void  AddProduct() {
		System.out.println("===== AddProduct MENU =====");
		System.out.println("enter how many product you want add");
		
		int size=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<size;i++) {
			 System.out.println("\nEnter details of product " + (i + 1));
			System.out.println("enter Product Name: ");
			String ProductName=sc.nextLine();
			
			System.out.println("enter the Price: ");
			double Price=sc.nextDouble();
			sc.nextLine();
			
			System.out.println("enter the Quantity: ");
			int Quantity=sc.nextInt();
			sc.nextLine();
			
			CartItem c=new CartItem(ProductName,Price,Quantity);
			obj.add(c);
			System.out.println("");
			
		}
	}
	
	public void DisplayCartItems() {
		System.out.println("===== DisplayCartItems Menu =====");
	    if (obj.isEmpty()) {
	        System.out.println("Cart is Empty!");
	        return;
	    }
		
		for(CartItem c:obj) {
			c.displayItemDetails();
		
		}
	}
	
	public void  SearchProduct() {
		System.out.println("===== SearchProduct Menu =====");
		System.out.println("Enter the Product id: ");
		int Productid=sc.nextInt();
	    if (obj.isEmpty()) {
	        System.out.println("Cart is Empty!");
	        return;
	    }
		
		for(CartItem c:obj) {
			if(c.getProductId()==Productid) {
				System.out.println("Product Details Are: ");
				c.displayItemDetails();
				break;
			}else
				System.out.println("Product Does Not Exits In Cart!!! ");
			
		}
		
	}
	
	public void UpdatProduct() {
		System.out.println("===== UpdatProduct Quantity Menu =====");
		System.out.println("Enter the Product id: ");
		int Productid=sc.nextInt();
	    if (obj.isEmpty()) {
	        System.out.println("Cart is Empty!");
	        return;
	    }

		for (CartItem c:obj) {
			if(c.getProductId()==Productid) {
				System.out.println("Enter The Product Quantity ");
				c.quantity=sc.nextInt();
				sc.nextLine();
				break;	
			}else
				System.out.println("Product Does Not Exits In Cart!!! ");
		}
	}
	
	public void RemoveProduct() {
		System.out.println("===== Remove Product from Cart Menu =====");
		System.out.println("Enter the Product id: ");
		int Productid=sc.nextInt();
		int pos=0;
		
		for(CartItem c:obj) {
			if(c.getProductId()==Productid) {
				pos=obj.indexOf(c);
				
			}else
				System.out.println("Product Does Not Exits In Cart!!! ");
		obj.remove(pos);
		}
	}
	
	public double  Totalcartvalue() {
		double TotalCartbill =0;
		
		for(CartItem c:obj) {
			TotalCartbill += (c.price * c.quantity);
			
		}
		return TotalCartbill;
		//System.out.println("TotalCartbill: "+TotalCartbill);
	}
	
	public void ApplyDiscount() {
		double TotalCartbill = Totalcartvalue();
		double discount=0;
		
		if(TotalCartbill<1000) {
			discount=TotalCartbill;
			
		}else if(TotalCartbill>1000 && TotalCartbill<3000) {
			discount= 5;
			
		}else if(TotalCartbill>3001 && TotalCartbill<5000) {
			discount= 10;
		
		}else if(TotalCartbill>5000) {
			discount= 15;
		}
		double DiscountAmount = (TotalCartbill  * discount)/100;
		
		System.out.println("TotalCartbill: "+TotalCartbill);
		System.out.println("Discount: ("+discount+"%)"+DiscountAmount);
		System.out.println("Final Payable Amount: "+(TotalCartbill-DiscountAmount));
		
	

}
}
