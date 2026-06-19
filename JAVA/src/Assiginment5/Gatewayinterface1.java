package Assiginment5;

import java.util.Scanner;

public class Gatewayinterface1 {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("***** WELCOME TO DIGITAL BANKING *****");
			System.out.println(" 1. CreditCardPayment \n 2. UPIPayment \n 3. exit ");
			System.out.println("enter choice: ");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("====== Welcome To CreditCardPayment Mode =====");
				System.out.println("enter the cardNumber: ");
				String cardNumber=s.next();
				System.out.println("enter the cardHolderName: ");
				String cardHolderName=s.next();
				System.out.println("enter the amount: ");
				double amount=s.nextDouble();
				Payment p=new CreditCardPayment(cardNumber,cardHolderName);
				p.makePayment(amount);
				break;
			case 2:
				System.out.println("====== UPIPayment Mode =====");
				System.out.println("enter the upiId: ");
				String upiId=s.next();
				System.out.println("enter the amount: ");
				double amount1=s.nextDouble();
				Payment p1=new UPIPayment(upiId);
				p1.makePayment(amount1);
				break;
			case 3:
				System.out.println("loged out!!! ");
				return;
			default:
				System.out.println("invalid choice... \n plz enter again!!!");
			}
		}
		

}

}
