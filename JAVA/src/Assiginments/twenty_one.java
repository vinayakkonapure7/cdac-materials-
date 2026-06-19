package Assiginments;
import java.util.Scanner;

public class twenty_one {
	public static int sumof(int num) {
		int i=1;
		int total=0;
		while(i<=num) {
			total=total+i;
			i++;	
		}
		return total;
	}

	public static void main(String[] args) {
		java.util.Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int num = s.nextInt();
		
		int result=sumof(num);
		
		System.out.println("sum of "+num+" neatural num is: "+result);

	}

}
