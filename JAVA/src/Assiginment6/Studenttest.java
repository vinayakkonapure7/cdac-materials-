package Assiginment6;

import java.util.ArrayList;
import java.util.Scanner;

public class Studenttest {
	

	public static void main(String[] args) {
		Scanner scc=new Scanner(System.in);
		StudentInput si=new StudentInput();
		

		
		while(true) {
			System.out.println("Welcome to Student Mangement System ");
			System.out.println(" 1.Add Student \n 2.Display Student \n 3.Search Student \n 4.UpdateStudent \n 5.DeleteStudent \n 6.SortStudent \n 7.Exit ");
			System.out.println("Enter the Choice: ");
			int choice=scc.nextInt();
			scc.nextLine();
			switch(choice) {
			case 1:
				si.AddStud();
				break;
			case 2:
				si.DisplayStudent();
				break;
			case 3:
				si.SearchStudent();
				break;
			case 4:
				si.UpdateStudent();
				break;
			case 5:
				si.DeleteStudent();
				break;
			case 6:
				si.SortStudent();
				break;
			case 7:
				System.out.println("loged out!!!");
				return;
			default:
				System.out.println("invaild choice!!!!");
				
			}
		}
		

		

	}

}
