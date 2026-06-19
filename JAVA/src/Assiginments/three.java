package Assiginments;
//3. Declare three subject marks (int) and calculate the total and average using arithmetic operators.
import java.util.Scanner;


public class three {
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter math marks (out 0f 100) : ");
		int math =s.nextInt();
		
		System.out.println("enter sci marks (out 0f 100) : ");
		int sci =s.nextInt();
		
		
		System.out.println("enter eng marks (out 0f 100) : ");
		int eng =s.nextInt();
		
		double total=(math+sci+eng);
		
		double avg=(total/300.0)*100;
		
		System.out.println("the total : " +total+ "\nthe average : "+avg);
		
		
		
	}

}
