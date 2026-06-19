package Assiginments_2;

import java.util.Scanner;

public class Stud {
	int id;
	String name;
	double marks;
	
	// input using method variable
	void input() {
		Scanner s =new Scanner(System.in);
		System.out.println("enter id: ");
		id = s.nextInt();
		System.out.println("enter name: ");
		name= s.next();
		System.out.println("enter marks: ");
		marks=s.nextDouble();
		
		
	}

	void condition() {
		if (marks>=75) {
			System.out.println("Distinction");
		}else if (marks>=60 && marks<=74) {
			System.out.println("First Class");
		}else if (marks>=50 && marks<=59) {
			System.out.println("Second Class");
		}else if (marks<50) {
			System.out.println("fail");
		}
		
	}

}
