package Assiginment5;

import java.util.Scanner;

public class BookingSysteminterface2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("*****  Online Ticket Booking System *****");
			System.out.println(" 1. MovieTicketBooking\n 2. TrainTicketBooking \n 3. exit ");
			System.out.println("enter choice: ");
			int choice=s.nextInt();
			s.nextLine();
			switch(choice) {
			case 1:
				System.out.println("the shows  are avaliable: ");
				System.out.println(" 1.Dune-part 3 \n 2. Dhurandhar: the revaenge \n 3. Avengers Doomsday");
				System.out.println("enter the movie name: ");
				String moviename=s.nextLine();
				System.out.println("enter the how many seats you want book: ");
				int ticketNumber=s.nextInt();

				MovieTicketBooking m=new MovieTicketBooking(moviename,ticketNumber);
				m.calTotalFare();
				System.out.println("enter the amount: ");
				double amount=s.nextDouble();
				m.makePayment(amount);
				break;
			case 2:
				System.out.println("enter the trainName : ");
				System.out.println(" 1.vande bhart  \n 2. durntho \n 3. tejas");
				String trainName=s.nextLine();
				System.out.println("enter the how many seats you want book: ");
				int totalseat=s.nextInt();
				TrainTicketBooking t1=new TrainTicketBooking(trainName,totalseat);
				t1.calTotalFare();
				System.out.println("enter the amount: ");
				double amount1=s.nextDouble();
				t1.makePayment(amount1);
				break;
			case 3:
				System.out.println("loged out!!! ");
				return;
			default:
				System.out.println("invalid choice!!! ");
				
				
				
				
				
				
				
			}
			
			}
		

	}

}
