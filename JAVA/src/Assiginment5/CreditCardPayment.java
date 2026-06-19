package Assiginment5;

class CreditCardPayment implements Payment {
	String cardNumber;
	String cardHolderName;
	int availableLimit=50000;
	
	public CreditCardPayment(String cardNumber, String cardHolderName) {

		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}
	
	public void makePayment(double amount) {
		
		if( cardNumber.length()==16 && amount <= availableLimit) {
			System.out.println("Payment Successful!!! \n Deduct amount: "+amount);
			System.out.println("------ Receipt ------ ");
			double Remaining=availableLimit-amount;
			System.out.println("cardHolderName: "+cardHolderName);
			System.out.println("Amount paid: "+amount);
			System.out.println("Remaining limit: "+Remaining);
			System.out.println("Transaction status: Payment Successfull!!!  ");
		}else {
			System.out.println("Invalid Card / Insufficient Limit");
		}
		
	}
	
}

class UPIPayment implements Payment{
	
	String upiId;
	double balance=50000;
	
	public UPIPayment(String upiId) {
		this.upiId = upiId;
		
	}


	public void makePayment(double amount) {
		
		if (upiId != null && upiId.contains("@") ) {
			System.out.println(" UPI ID is valid ");
			if(amount<=balance) {
				System.out.println("Payment Successful!!! \n Deduct amount: "+amount);
				System.out.println("------ Receipt ------ ");
				double Remaining=balance-amount;
				System.out.println(" UPI ID:"+upiId);
				System.out.println("Amount paid: "+amount);
				System.out.println("Remaining balance: "+Remaining);
				System.out.println("Transaction status: Payment Successfull!!!  ");
			}else {
				System.out.println("Insufficient balance");
			}
		}else 
			System.out.println("Invalid UPI ID: ");
		
	}

}
	

