package Assiginments;

public class twenty {
	public static void vote(int age) {
		if(age>=18) {
			System.out.println("eligible");
		}else
			System.out.println("not eligible");
	}

	public static void main(String[] args) {
		int age=24;
		vote(age);

	}

}
