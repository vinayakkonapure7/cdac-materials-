package Assiginment5;

import java.util.Scanner;

abstract class Employee {
	String empNam;
	int empId;
	double salary;
	

	public Employee(String empNam, int empId, double salary) {
		super();
		this.empNam = empNam;
		this.empId = empId;
		this.salary = salary;
	}

	abstract double calculateBonus();
	
	

}
class FullTimeEmployee extends Employee{
	double bouns;
	


	public FullTimeEmployee(String empNam, int empId, double salary) {
		super(empNam, empId, salary);
	}



	double calculateBonus() {
		bouns=salary*0.20;
		System.out.println("the bouns of FullTimeEmployee is: "+bouns);
		return bouns;
		
		
	}

}

class PartTimeEmployee extends Employee{
	double bouns;
	
	public PartTimeEmployee(String empNam, int empId, double salary) {
		super(empNam, empId, salary);
		
	}

	double calculateBonus() {
		bouns=salary*0.10;
		System.out.println("the bouns of PartTimeEmployee is: "+bouns);
		return bouns;
		
	}

}