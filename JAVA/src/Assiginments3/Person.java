package Assiginments3;

class Person {
	String name; 
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	


}

class Student extends Person{
	int marks;

	public Student(String name, int age,int marks) {
		super(name, age);
		this.marks=marks;
	}
	
}

class GraduateStudent extends Student{
	String course;

	public GraduateStudent(String name, int age, int marks,String course) {
		super(name, age, marks);
		this.course=course;
		
		
	}
	
	void calgrade() {
		if(marks>=75) {
			System.out.println("Distinction");
		}else if (marks>60 && marks<74) {
			System.out.println("First Class ");
		}else if (marks<60) {
			System.out.println("pass");
		}
	}
	
	void placement() {
		if (marks>=65) {
			System.out.println("Eligible for placement ");
	}else
		System.out.println("not eligible");
	}
	void display() {
		System.out.println("name: "+name+"\nage: "+age+"\nmarks: "+marks+"\ncourse: "+course);
	}
}	
	
	
	