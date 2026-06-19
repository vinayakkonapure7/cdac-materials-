package Assiginment5;

import java.util.Scanner;

class TrainTicketBooking implements Ticket{
	String trainName;
	int fare=350;
	int availableSeats=60;
	double totalFare;
	int totalsets;

	
	public TrainTicketBooking(String trainName,int totalsets) {
		this.trainName = trainName;
		this.totalsets=totalsets;
	}
	public void calTotalFare()
	{
		totalFare = fare*totalsets;
		System.out.println("the total fare is: "+totalFare);
	}
	

	public void makePayment(double amount) {
		
		if(totalsets<=availableSeats) {
			availableSeats-=totalsets;
			if(amount==totalFare) {
				System.out.println("ticket are "+totalsets+" Conformed");
				System.out.println("----- Summery -----");
				System.out.println("train Name: "+trainName);
				System.out.println("total tickets "+totalsets+" are conformed");
				System.out.println("Total Amount paid: "+amount);
				System.out.println("Remaining seats Are: "+availableSeats);	
				
			}else {
				System.out.println("insufficient amount... ");
			}
			
		}
		
		
	}
	
}
