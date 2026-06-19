package lab;

import java.util.Scanner;

public class CartItemmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ShoppingCartSystem scy = new ShoppingCartSystem();
		
		while(true) {
			System.out.println("===== Welcome To Online Shopping Cart System ===== ");
			System.out.println("1. Add Product to Cart ");
			System.out.println("2. Display Cart Items");
			System.out.println("3. Search Product in Cart");
			System.out.println("4. Update Product Quantity");
			System.out.println("5. Remove Product from Cart");
			System.out.println("6. Calculate Total Cart Bill ");
			System.out.println("7. Apply Discount");
			System.out.println("8. LOG OUT!!!");
			
			System.out.println("enter the choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				scy.AddProduct();
				break;
			case 2:
				scy.DisplayCartItems();
				break;
			case 3:
				scy.SearchProduct();
				break;
			case 4:
				scy.UpdatProduct();
				break;
			case 5:
				scy.RemoveProduct();
				break;
			case 6:
				 System.out.println("Total Cart Value: " + scy.Totalcartvalue());
				 break;
			case 7:
				scy.ApplyDiscount();
				break;
			case 8:
				System.out.println("signing off...");
				return;
			default:
				System.out.println("invalid choice");
				
			}
		}

	}

}
