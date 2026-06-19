package Assiginments3;

import java.util.Scanner;

public class Customer {
	int customerId; 
	String customerName;
	Address add;
	public Customer(Address add) {
		//this.customerId = customerId;
		//this.customerName = customerName;
		this.add = add;
	}
	
	void inputcust() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter customer id: ");
		customerId=s.nextInt();
		System.out.println("enter customer name: ");
		customerName=s.next();
		add.inputadd();
	}
	
	void display() {
		System.out.println("customerId: "+customerId+"\ncustomerName: "+customerName);
		add.displayadd();
	}

}
