package Assiginments3;

import java.util.Scanner;

public class Emphas {
	int empId; 
	String empName;
	double salary;
	Depthas dept;
	public Emphas( Depthas dept) {
		this.dept = dept;
	}
	
	void inputEmp() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter empid: ");
		empId=s.nextInt();
		System.out.println("Enter emp name: ");
		empName=s.next();
		System.out.println("Enter emp salary: ");
		salary=s.nextDouble();
		dept.inputdept();
		
	}
	void anulasal() {
		double total=salary*12;
		System.out.println("the annual salary: "+total);
	}
	
	void display() {
		System.out.println("empID: "+empId+"\nEmpName: "+empName+"salary: "+salary);
		System.out.println();
		dept.displaydept();
	}
	

}
