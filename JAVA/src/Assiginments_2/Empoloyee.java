package Assiginments_2;

public class Empoloyee {
	int id;
	String name;
	double sal;
	
	void input(int iid,String na,double sall) {
		id=iid;
		name=na;
		sal=sall;
		System.out.println("id : "+id);
		System.out.println("name :"+name);
		System.out.println("sal : "+sal);
	}
	
	
	void increas_sal(){
			sal= sal+(sal*0.10f);

	}
	void display() {
		System.out.println("increment sal"+sal);
	}
	


}
