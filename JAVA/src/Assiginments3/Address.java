package Assiginments3;

import java.util.Scanner;

public class Address {
	String street;
	String city;
	int pincode ;
	
	void inputadd() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter street name: ");
		street=s.next();
		System.out.println("enter city name: ");
		city=s.next();
		System.out.println("enter pincode : ");
		pincode=s.nextInt();
		
	}
	void displayadd() {
		System.out.println("street: "+street+"\ncity: "+city+"\npincode: "+pincode);
	}
	

}
