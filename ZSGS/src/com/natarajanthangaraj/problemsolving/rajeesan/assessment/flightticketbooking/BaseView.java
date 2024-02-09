package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Passenger;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;

public class BaseView {
	Scanner scan = new Scanner(System.in);

	protected int getInt() {
		int n;
		while (true) {
			try {
				n = scan.nextInt();
				scan.nextLine();
				return n;
			} catch (InputMismatchException e) {
				System.out.print(" Enter valid Input : ");
				scan.nextLine();
			}
		}
	}
	protected String getString() {
		return scan.nextLine();
	}
	protected void showFlight(Flight flight) {
		System.out.println(" Flight Number : "+flight.getFlightNumber());
		System.out.println(" Flight Name   : "+flight.getFlightName());
		System.out.println(" Departure Time : "+flight.getDepartTime());
		System.out.println(" Arrival Time : "+flight.getArrivalTime());
		System.out.println(" Fare         : "+flight.getFare());
		System.out.println(" Seats        : "+flight.getSeats());
		System.out.println("\n");
	}
	protected void showPassenger(Passenger passenger) {
		System.out.println(" Name : "+passenger.getName());
		System.out.println(" Age  : "+passenger.getAge());
		System.out.println(" Gender : "+passenger.getGender());
		System.out.println(" ID :"+passenger.getId());
		if(passenger.getFlightNumber()!=0) {
			System.out.println(" Flight Number : "+passenger.getFlightNumber());
		}
		System.out.println("\n"); 
		}
	protected void showTicket(Ticket ticket) {
		List<Passenger>passList=ticket.getList();
		showFlight(ticket.getFlight());
		for(int i=0;i<passList.size();i++) {
			showPassenger(passList.get(i));
		}
		System.out.println(" Ticket's PNR number : "+ticket.getPNRNumber());
		System.out.println(" Ticket status : "+ticket.getStatus());
		
	}
}
