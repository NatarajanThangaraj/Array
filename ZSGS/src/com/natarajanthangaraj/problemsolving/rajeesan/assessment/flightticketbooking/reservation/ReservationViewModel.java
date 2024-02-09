package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.reservation;

import java.util.ArrayList;
import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository.Repository;

public class ReservationViewModel {
	ReservationView reserveView;
	private List<Flight> listOfFlights;

	public ReservationViewModel(ReservationView reservationView) {
		this.reserveView = reservationView;
	}

	public List<Flight> getAllFlights() {
		return Repository.getInstance().getAllFlights();
	}

	public void getflightsBasedOnRequirements(String from, String to) {
		listOfFlights = Repository.getInstance().getAllFlights();
		List<Flight> matchingFlights = new ArrayList<>();
		for (Flight flight : listOfFlights) {
			List<String> list = flight.getList();
			if (list.contains(from) && list.contains(to)) {
				matchingFlights.add(flight);
			}
		}
		reserveView.showFlights(matchingFlights);
		reserveView.getTicketDetails();
	}

	public Flight getflightBasedOnNumber(int flightNumber) {
		listOfFlights = Repository.getInstance().getAllFlights();

		for (Flight flight : listOfFlights) {
			if (flight.getFlightNumber() == flightNumber) {
				return flight;
			}
		}
		return null;

	}

	public void storeTickets(Ticket ticket) {
		if(Repository.getInstance().storeTickets(ticket)) {
			reserveView.successMessage();
		}
		
	}

	public Ticket getTicketBasedOnPNRNumber(int pnrNumber) {	 
		List<Ticket> ticketList=Repository.getInstance().getTickets();
		for(Ticket ticket:ticketList) {
			if(ticket.getPNRNumber()==pnrNumber) {
				return ticket;
			}
		}
		return null;
	}

	public List<Ticket> getAllTickets() {
		return Repository.getInstance().getTickets();
	}

}
