package just;

import java.util.Scanner;

public class array {
	
	void normalMethod() {
		// normal method
		int marks[]=new int[4];
		marks[0]=98;
		marks[1]=78;
		marks[2]=76;
		marks[3]=67;
		
		System.out.println(marks[3]);
		
		// using loops insted of indusaly like above
		
		for(int i=0;i<4;i++) {
			System.out.println(marks[i]);
		}
	}
	void multipleatonce() {
		// usingmultiple at once
		int marks1[]= {89,87,90};
		
		for(int i=0;i<3;i++) {
			System.out.println("multiple :"+marks1[i]);
		}	
	}
	
	void usinginput() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=s.nextInt();
		int numbers []=new int[size];
		
		//input loop
		for (int i=0; i<size; i++) {
			System.out.println("enter marks: ");
			numbers[i]=s.nextInt();
			
		}
		//output loop
		for(int i=0;i<size;i++) {
			System.out.println(numbers[i]);
		}
	}
	void searchvalue() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=s.nextInt();
		int numbers [] = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("enter id : ");
			numbers[i]=s.nextInt();
		}
		System.out.println("enter the id you nedd: ");
		int seacrh=s.nextInt();
		for(int i=0;i<numbers.length;i++) {
		
			if(numbers[i]==seacrh) {
				System.out.println("found: "+i);
			}
			
			
		}
		
		
	}
		
		

	public static void main(String[] args) {
		array a=new array();
		//a.normalMethod();
		a.multipleatonce();
		//a.usinginput();
		//a.searchvalue();

		

	
		
}
}
