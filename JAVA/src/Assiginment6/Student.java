package Assiginment6;

public class Student {
	int studentId;
	String studentName;
	String course;
	int marks;
	public Student(int studentId, String studentName, String course, int marks) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}
	void display() {
		System.out.println("studentId: "+studentId+"\nstudentName: "+studentName+"\ncourse: "+course+"\nmarks: "+marks);
	}
}
