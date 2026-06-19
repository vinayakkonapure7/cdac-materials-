package Assiginments;


public class nineteen {
	
	public static void si(double principal,double rate,int time) {
		
		
		double si=(principal*rate*time)/100;
		System.out.println("the simple interset is: "+si);
	}

	public static void main(String[] args) {
		double principal=5000;
		
		double rate =20;
		
		int time =2;
		
		si(principal,rate,time);

	}

}
