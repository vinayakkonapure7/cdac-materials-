package Assiginment6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentInput {
	static ArrayList<Student> obj=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	
	void AddStud() {
		System.out.println("----- ADD MENU -----");
		System.out.println("enter how many student you want add: ");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Student Course: ");
            String course =  sc.nextLine();
            
            System.out.print("Enter Student Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            
            Student s =new Student(id,name,course,marks);
            obj.add(s);
            System.out.println("Student Succefully added!!");
          
			
		}
		
	}
	
	void DisplayStudent() {
		System.out.println();
		System.out.println("----- DISPLAY MENU -----");
		for(Student s:obj) {
			s.display();
		}
	}
	
	void SearchStudent() {
		System.out.println("----- SEARCH MENU -----");
		System.out.println("enter the student id: ");
		int searchid=sc.nextInt();
		
		for(Student s:obj) {
			if(s.studentId==searchid) {
				System.out.println("Student Found!!! ");
				s.display();
				break;
			}else
				System.out.println("Student Not Found!!! ");
				
				
		}
	
	
	}
	
	void UpdateStudent() {
		System.out.println("----- UPDATE MENU -----");
		System.out.println("enter the student id: ");
		int updateid=sc.nextInt();
		 
		for(Student s:obj) {
			
			if(s.studentId==updateid) {	            
	            System.out.print("Enter Student Name: ");
	            
	            s.studentName = sc.next();
	            sc.nextLine();
	            
	            System.out.print("Enter Student Course: ");
	            s.course= sc.nextLine();
	            
	            
	            System.out.print("Enter Student Marks: ");
	            s.marks = sc.nextInt();
	            sc.nextLine();
	           
	            System.out.println("Student Succefully Udated!!");
	            
	            break;

			}
			else
				System.out.println("Student Id Not Found!!!");
								

		}
		
		
		
	}
	
	void DeleteStudent() {
		System.out.println("----- DELETE MENU -----");
		System.out.println("enter the student id: ");
		int deleteid=sc.nextInt();
		int pos=0;
		for(Student s:obj) {
			if(s.studentId==deleteid) {
				pos=obj.indexOf(s);
			}
		}
		obj.remove(pos);
		System.out.println("deleted student id: ");
		
	}
	
	void SortStudent() {
		System.out.println("----- SORTING MENU -----");

		obj.sort(Comparator.comparing((Student s)->s.marks));
		
		for(Student s:obj) {
			System.out.println("studentId: "+s.studentId+"\nstudentName: "+s.studentName+"\ncourse: "+s.course+"\nmarks: "+s.marks);
			
		}
		
	}


}
