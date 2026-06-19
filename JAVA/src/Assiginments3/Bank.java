package Assiginments3;

import java.util.Scanner;

class Bank {
	int accountNumber;
	int balance ;
	
	public Bank(int accountNumber,int balance) {
		this.accountNumber =accountNumber;
		this.balance = balance;
		
		
	}
	void display1() {
		System.out.println("accountNo : "+accountNumber);
		System.out.println("balance : "+balance);
	}
	

}
class Saving extends Bank{
	double interestRate;

	public Saving(int accountNumber,int balance ) {
		super(accountNumber,balance );	
		
	}
	
	void calinterest() {
		interestRate=(balance*0.10f);
		System.out.println("interestRate is "+interestRate);
	
	}
	
	void updatedbal() {
		double updatedbal=balance+interestRate;
		System.out.println("your updated Balance"+updatedbal);
		
	}
	
	
}