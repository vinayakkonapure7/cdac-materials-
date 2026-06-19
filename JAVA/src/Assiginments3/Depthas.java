package Assiginments3;

import java.util.Scanner;

public class Depthas {
	int deptId;
	String deptName;
	
	void inputdept() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter deptId: ");
		deptId=s.nextInt();
		System.out.println("enter dept name: ");
		deptName=s.next();
		
	}
	void displaydept() {
		System.out.println("deptid: "+deptId+"\ndeptname: "+deptName);
	}
		

}
