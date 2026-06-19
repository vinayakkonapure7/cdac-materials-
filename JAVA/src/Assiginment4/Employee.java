package Assiginment4;

import java.util.Scanner;



class Employee {
	 String name ;
	 double baseSalary; 

	public Employee(String name, double baseSalary) {
		this.name = name;
		this.baseSalary = baseSalary;
	}
	void calculateSalary() {
		System.out.println("salary: "+baseSalary);
	}

	public static void main(String[] args) {
		while(true) {
			System.out.println("1.manger \n2.devloper \n3.exits");
			Scanner s=new Scanner(System.in);
			System.out.println("enter choice: ");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				Manager m = new Manager("heery",10000);
				m.calculateSalary();
				break;
			case 2:
				Developer d=new Developer("john",5000);
				d.calculateSalary();
				break;
			case 3:
				System.out.println("exit");
				return;
			default:
				System.out.println("invalid");
				

			}
			
		}
		

	}

}

class Manager extends Employee{
	int bouns;

	public Manager(String name, double baseSalary) {
		super(name, baseSalary);
		
	}
	
	void calculateSalary() {
		
		System.out.println("salary: "+(baseSalary+(baseSalary*0.20)));
	}
	
}


class Developer extends Employee{
	int bouns;

	public Developer(String name, double baseSalary) {
		super(name, baseSalary);
		
	}
	
	void calculateSalary() {
		System.out.println("salary: "+(baseSalary+(baseSalary*0.10)));
	}
	
}