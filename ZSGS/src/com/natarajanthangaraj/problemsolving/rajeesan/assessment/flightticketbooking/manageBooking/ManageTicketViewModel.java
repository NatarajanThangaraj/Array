package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.manageBooking;

import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Passenger;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository.Repository;

public class ManageTicketViewModel {
public ManageTicketView manageView;
	public ManageTicketViewModel(ManageTicketView manageView) {
		this.manageView=manageView;
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
	public boolean putTicket(Ticket ticket) {
		
		return Repository.getInstance().addTicket(ticket);
	}
	public Passenger getPassanger(int passID) {
		List<Ticket> ticketList=Repository.getInstance().getTickets();
		for(Ticket ticket:ticketList) {
		List<Passenger>passengerList=ticket.getList();
		for(Passenger passenger:passengerList) {
			if(passenger.getId()==passID) {
				return passenger;
			}
		}
		}
		return null;
	}
	public Ticket changeStatus(int option, Ticket ticket) {
		switch(option) {
		case 1->{
			ticket.setStatus("CNF");
			Repository.getInstance().addTicket(ticket);
		}
		case 2->{
			ticket.setStatus("CANCEL");
			Repository.getInstance().addTicket(ticket);
		}
		default->{
			return null;
		}
		}
		return ticket;
	}

}
