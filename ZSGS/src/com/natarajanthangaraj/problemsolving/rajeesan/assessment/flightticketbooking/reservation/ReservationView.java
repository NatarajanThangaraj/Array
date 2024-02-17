package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.reservation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.BaseView;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Passenger;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;

public class ReservationView extends BaseView{
 public ReservationViewModel reserveViewModel;
 public Ticket ticket;
 public ReservationView() {
	 this.reserveViewModel=new ReservationViewModel(this);
 }
public  void showAllRoutes() {
	 Set<String>flightSet=new HashSet<>();
	 List<String> routes;
	 List<Flight>flightList=reserveViewModel.getAllFlights();
	 System.out.println(flightList);
	 for(Flight flight:flightList) {
		 routes=flight.getList();
		 for(String city:routes) {
			 flightSet.add(city);
		 }
	 }
	System.out.println(flightSet);
	 System.out.println("\n THE ALL ROUTES OF FLIGHT \n");
	 int n=1;
	 for(String city : flightSet) {
		 System.out.println(n+"  "+city);
		 n++;
	 }
 }
public void requiredTrip() {
	System.out.println("\n ## PLAN MY JOURNEY ## \n");
	String from,to;
	System.out.print(" Enter On-boarding City Name : ");
	    from=getString();
	System.out.println(" Enter Destination City Name : ");
	    to=getString();
	    reserveViewModel.getflightsBasedOnRequirements(from,to);
}
public void showFlights(List<Flight> matchingFlights) {
	System.out.println("\n AVAILABLE FLIGHTS \n");
	for(Flight flight : matchingFlights ) {
		showFlight(flight);
		System.out.println("\n\n");
	}
	
}
int getFlightNumber() {
	System.out.print(" Enter Flight Number : ");
	return getInt();
}
public void getTicketDetails() {
	Ticket ticket =new Ticket();
	Flight flight;
	int flightNumber=getFlightNumber();
	List<Passenger>passengerList=getPassengerDetails();
	ticket.setFlight(reserveViewModel.getflightBasedOnNumber(flightNumber));
	ticket.setList(passengerList);
	ticket.getFlight().setFare((ticket.getFlight().getFare())*passengerList.size());
	ticket.setPNRNumber(generatePNRNumber());
	reserveViewModel.storeTickets(ticket);
	showTicket(ticket);
	
}
private List<Passenger> getPassengerDetails() {
	List<Passenger>passengerList=new ArrayList<>();
	System.out.print(" Enter Number of Passengers : ");
	int n=getInt();
	for(int i=0;i<n;i++) {
		passengerList.add(getPassenger());
	}
	return passengerList;
}
private Passenger getPassenger() {
	Passenger passenger=new Passenger();
	System.out.print(" Name : ");
	passenger.setName(getString());
	System.out.print(" Age : ");
	passenger.setAge(getInt());
	System.out.print(" Gender : ");
	passenger.setGender(getString());
	System.out.print(" ID : ");
	passenger.setId(getInt());
	return passenger;
}
int generatePNRNumber() {
	Random ran =new Random();
	return ran.nextInt(10000);
}
public void successMessage() {
	System.out.println(" Ticket Booked succesfully !!! ");
	
}
public void getTicketUsingPNRNumber() {
	System.out.print(" Enter PNR Number : ");
	int pnrNumber=getInt();
	Ticket ticket = reserveViewModel.getTicketBasedOnPNRNumber(pnrNumber);
	showTicket(ticket);
}
public void showAllTicket() {
	List<Ticket>ticketList=reserveViewModel.getAllTickets();
	if(ticketList==null) {
		System.out.println(" Currently..No tickets are booked ");
	}
	System.out.println(" Total Number of Tickets : "+ticketList.size());
	for(Ticket ticket:ticketList) {
		showTicket(ticket);
	}
}


}
