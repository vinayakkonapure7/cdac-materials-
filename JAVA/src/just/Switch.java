package just;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("enter choice \n 1.add \n 2.sub \n 3.exit");
			int ch=s.nextInt();
			switch(ch) {
				case 1:
				System.out.println("enter num1: ");
				int num1=s.nextInt();
				System.out.println("enter num2: ");
				int num2=s.nextInt();
				System.out.println("Addition is : "+(num1+num2));
				break;
			
				case 2:
				System.out.println("enter num1: ");
				int numm1=s.nextInt();
				System.out.println("enter num2: ");
				int numm2=s.nextInt();
				System.out.println("Addition is : "+(numm1-numm2));
				break;
				case 3:
					return;
				default:
				System.out.println("invalid!!");
			

			
			}
		}
	}

}
