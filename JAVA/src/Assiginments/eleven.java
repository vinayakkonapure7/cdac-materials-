//11. Declare basic salary (double) and calculate final salary after adding bonus based on given condition.

//Salary < 20000 → 10% bonus

//Salary between 20000 and 50000 → 15% bonus

//Salary > 50000 → 20% bonus'''

package Assiginments;

public class eleven {

	public static void main(String[] args) {
		double sal=25000;
		
		if(sal<20000) {
			double total=sal+(sal*10.0)/100;
			System.out.println("final salary"+total);
		}else if(sal>50000) {
			double total=sal+(sal*10.0)/100;
			System.out.println("final salary"+total);
		}else if(sal<50000) {
			double total=sal+(sal*10.0)/100;
			System.out.println("final salary"+total);
		}
	}

}
