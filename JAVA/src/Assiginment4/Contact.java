package Assiginment4;

public class Contact {
	String name;
	String phoneNumber;
	String email;
	
	public Contact(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	void addContact(String name, String phoneNumber) {
		System.out.println("welcome to phonebook");
		if(phoneNumber.length()==10) {
			System.out.println("name: "+name+"\n phoneNumber: "+phoneNumber);
		}else
			System.out.println("invalid phonenumber");
	}
	
	void addContact(String name, String phoneNumber, String email) {
		System.out.println("welcome to phonebook");
		if(phoneNumber.length()==10) {
			System.out.println("name: "+name+"\n phoneNumber: "+phoneNumber+"\n email"+email);
		}else
			System.out.println("invalid phonenumber");
	}
	
	void addContact(String name){
		System.out.println("name: "+name+"\n phonenumber dummy: 8976564534");
		
	}



	public static void main(String[] args) {
		Contact co =new Contact("karan aujla","8967654590","avdchg12@gmailcom");
		co.addContact("heer");
		co.addContact("ranjha", "90786765454345");
		co.addContact("karan aujla","8967654590","avdchg12@gmailcom");
		
	}

}
