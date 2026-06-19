package just;

import java.util.Scanner;

public class Arraymange {
	static int[] createarray() {
		Scanner s =new Scanner(System.in);
		int num []=new int[5];
		
		for (int i=0;i<5;i++) {
			System.out.println("enter the number ");
			num[i]=s.nextInt();
			
		}
		System.out.println("array created ");
		return num;
		
	}
	
	static void displayarray(int[] num) {
		
		for(int ele:num) {
			System.out.println(ele);
		}
	}
	
	static int sumofarray(int[] num) {
		int sum=0;
		
		for(int ele:num) {
			sum=sum+ele;
			
		}
		return sum;
	}

}
