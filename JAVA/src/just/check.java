package just;

import java.util.Scanner;

public class check {
	public static void check(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the upiid: ");
		String upiId=s.next();
		
		if (upiId != null && upiId.contains("@") ) {
			
			System.out.println(" UPI ID is valid ");
			
			
		}else {
			System.out.println("Payment Failed: Invalid UPI ID");
		}
		
	}

	public static void main(String[] args) {
		check();

	}

}
