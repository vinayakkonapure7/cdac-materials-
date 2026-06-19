package Assiginments3;

import java.util.Scanner;



class Emp {
	int empId;
	double salary;
	
	public Emp(int empId, double salary) {
		
		this.empId = empId;
		this.salary = salary;
	}

}

class Developer extends Emp{
	String programmingLanguage;

	public Developer(int empId, double salary,String programmingLanguage) {
		super(empId, salary);
		this.programmingLanguage=programmingLanguage;
		
	}
	
	
	void projectbouns() {
		double bouns=salary+(salary*.20f);
		System.out.println("the bouns for devloper: "+bouns);
		
	}
	void displaydev() {
		System.out.println("EMPID: "+empId+"\n salary: "+salary+"\n programmingLanguage: "+programmingLanguage);
	}
	
}

class Testser extends Emp{
	String testingTool;

	public Testser(int empId, double salary,String testingTool) {
		super(empId, salary);
		this.testingTool=testingTool;
	}

	
	void bugfix() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the how many bug fixed: ");
		int bugs=s.nextInt();
		if (bugs>1) {
			double increment=500*bugs;
			double finalsal= salary+increment;
			System.out.println("bugs incentive:"+increment);
			System.out.println("total sal"+finalsal);
		}
		
	}
	void displaytest() {
		System.out.println("empid: "+empId+"\n salary: "+salary+"\n testingTool: " +testingTool);
		
	}
	
	
}