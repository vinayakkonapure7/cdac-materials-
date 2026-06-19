package Assiginment4;

import java.util.Scanner;

class Payment {
	double amount;
	

	public Payment() {
		System.out.println("enter the amount to transfer");
		 Scanner s =new Scanner(System.in);
		amount=s.nextDouble();
		//this.amount = amount;
		
		
	}
	void  processPayment() {
		System.out.println("the payment transferd suceesfully"+amount);
	}
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("***** WELCOME TO DIGITAL BANKING *****");
			System.out.println(" 1.CreditCardPayment \n 2.NetBankingPayment \n 3.UpiPayment \n 4.exit \n enter the choice");
			Scanner s =new Scanner(System.in);
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				
				CreditCardPayment c= new CreditCardPayment();
				c.inputcard();
				c.processPayment();
				break;
			case 2:
				NetBankingPayment n=new NetBankingPayment();
				n.inputnet();
				n.processPayment();
				break;
			case 3:
				UpiPayment u=new UpiPayment();
				u.inputupi();
				u.processPayment();
				break;
			case 4:
				System.out.println("loged out!!!");
				return;
			default:
				System.out.println("invalid choice!!! \n ENTER CHOICE AGAIN");
				
			}
			
		}

}
	



}

class CreditCardPayment extends Payment{
	String CardNO;
	int pin;
	public CreditCardPayment() {
		super();
			
	}
	
	void inputcard() {
		System.out.println("====== WELOCOME TO CreditCardPayment MODE ====== ");
		Scanner s =new Scanner(System.in);
		System.out.println("enter cardNO: ");
		CardNO=s.next();
		System.out.println("enter pin: ");
		pin=s.nextInt();
		
	}
	
	void processPayment() {
		
		if(CardNO.length()==12) {
			System.out.println("service charges 2%");
			System.out.println("Payment done sucessfully!!"+(amount+(amount*0.02)));
		}else 
			System.out.println("wrong card no!!!");
		
	}	
	
}


class NetBankingPayment extends Payment{
	String userid;
	int paswd;
	
	public NetBankingPayment() {
		super();

	}
	
	void inputnet() {
		System.out.println("====== WELOCOME TO NetBankingPayment MODE ====== ");
		Scanner s =new Scanner(System.in);
		System.out.println("enter userid: ");
		userid=s.next();
		System.out.println("enter paswd: ");
		paswd=s.nextInt();
		
	}
	
	void processPayment() {
		
		if(paswd==1234) {
			System.out.println("service charges 10Rs");
			System.out.println("Payment done sucessfully!!"+(amount+10));
			
		}else 
			System.out.println("wrong pin !!!");
		
	}
	
	
}


class UpiPayment extends Payment{
	String upiid;
	String pin;
	public UpiPayment() {
		super();

	}
	
	void inputupi() {
		System.out.println("====== WELOCOME TO UpiPayment MODE ====== ");
		Scanner s =new Scanner(System.in);
		System.out.println("enter upiid: ");
		upiid=s.next();
		System.out.println("enter pin: ");
		pin=s.next();
		
	}
	
	void processPayment() {
		if(pin.length()==6) {
			System.out.println("Payment done sucessfully!!"+amount);
		}else 
			System.out.println("pin must contain 6 digit !!!");
		
	}

	
}










