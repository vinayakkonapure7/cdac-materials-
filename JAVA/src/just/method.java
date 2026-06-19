package just;

import java.util.Scanner;

public class method {
	void example(String name) {
		System.out.println("welcome!!!"+name);
	}

	public static void main(String[] args) {
		method m =new method();
		Scanner s=new Scanner(System.in);
		String name=s.next();
		m.example(name);

	}

}
