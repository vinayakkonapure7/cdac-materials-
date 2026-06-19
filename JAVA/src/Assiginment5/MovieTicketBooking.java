package Assiginment5;

import java.util.Scanner;



class MovieTicketBooking implements Ticket{
	String movieName;
	double ticketPrice=200;
	int availableSeats=20;
	double totalFare;
	int ticketNumber;
	

	public MovieTicketBooking(String movieName,int ticketNumber) {
		this.movieName = movieName;
		this.ticketNumber=ticketNumber;
	}
	
	public void calTotalFare()
	{
		totalFare = ticketPrice*ticketNumber;
		System.out.println("the total fare is: "+totalFare);
	}


	public void makePayment(double amount) {

				if(ticketNumber<=availableSeats) {
					availableSeats-=ticketNumber;
					//double toatlfare=ticketPrice*ticketNumber;
					
					if(amount==totalFare) {
						System.out.println("Booking Successful...");
						System.out.println("----- Summery -----");
						System.out.println("Movie name: "+movieName);
						System.out.println("total tickets "+ticketNumber+" are conformed");
						System.out.println("Total Amount paid: "+amount);
						System.out.println("Remaining seats Are: "+availableSeats);	
					}else {
						System.out.println("insufficient amount...");
					}

				}else
					System.out.println("sorry plz try again");
				
		
	}


}




