//14. Declare number of electricity units (int) and calculate total bill amount based on given rate conditions.

package Assiginments;

public class fourteen {

	public static void main(String[] args) {
		int unit=250;
		float amount;
		
		if(unit<=100) {
			amount=unit*1;
			System.out.println("the bill is: "+amount);
		}else if(unit<=200) {
			amount=100*1+(unit-100)*2;
			System.out.println("the bill is: "+amount);
		}else if(unit<=300) {
			amount=100*1+100*2+(unit-100)*3;
			System.out.println("the bill is: "+amount);
		}else
			System.out.println("invalid unit");
		
	}

}
