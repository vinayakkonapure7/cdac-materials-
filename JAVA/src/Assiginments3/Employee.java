package Assiginments3;

class Employee {
	String name;
	double basicSalary;
	
	public Employee(String name, double basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	void display() {
		System.out.println("Name: "+name+"\nbasicSalary: "+basicSalary);
	}
	

}

class PermanentEmployee extends Employee{
	
	double bonus;

	public PermanentEmployee(String name, double basicSalary,double bonus) {
		super(name, basicSalary);
		this.bonus=bonus;
	}
	
	void calsal() {
		bonus=basicSalary+bonus;
		System.out.println("the bonus is: "+bonus);
		
	}
	
	void tax() {
		double dedtax=bonus-(bonus*0.10);
		System.out.println("deduct tax (10%): "+dedtax);
	}
	
}
