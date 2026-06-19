//9. Declare principal (double), rate (double), and time (int); calculate simple interest and display whether it is high or low based on value.
package Assiginments;
import java.util.Scanner;
public class nine {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter principal: ");
		double principal=s.nextDouble();
		
		System.out.println("enter rate: ");
		double rate=s.nextDouble();
		
		System.out.println("enter time: ");
		int time=s.nextInt();
		
		double si=(principal*rate*time)/100;
		
		if(si>1000) {
			System.out.println("the simple intersect is \nHIGH: " +si);
		}else
			System.out.println("the simple intersect is \nLOW: " +si);
		

	}

}
