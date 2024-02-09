package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;

public class Repository implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Flight> allFlights;
	private List<Ticket> tickets;
	private static Repository repository;
	private static final String flightURL = "C:\\Users\\ELCOT\\eclipse-workspace\\ZSGS\\ZSGS\\src\\com\\natarajanthangaraj\\problemsolving\\rajeesan\\assessment\\flightticketbooking\\repository\\Flight.ser";

	private Repository() {
		this.allFlights = new ArrayList<>();
		this.tickets=new ArrayList<>();
	}

	public static Repository getInstance() {
		if (repository == null) {
			loadPreviousData();

		}
		return repository;
	}

	private static void loadPreviousData() {
		repository = new Repository();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(flightURL));
			repository = (Repository) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (repository.tickets == null) {
	        repository.tickets = new ArrayList<>();
	    }

	}

	public boolean createFlightRoutes(List<Flight> listOfFlights) {
		for (Flight flight : listOfFlights) {
			allFlights.add(flight);
		}
		updateInDataBase();
		return true;

	}
	public boolean storeTickets(Ticket ticket) {
		tickets.add(ticket);
		updateInDataBase();
		return true;
	}

	private void updateInDataBase() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(flightURL));
			oos.writeObject(repository);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setAllFlights(List<Flight> flights) {
		this.allFlights = flights;
	}

	public List<Flight> getAllFlights() {
		return allFlights;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public boolean addTicket(Ticket ticket) {
		List<Ticket>list=getTickets();
		for(Ticket eachTicket: list) {
			if(eachTicket.getPNRNumber()==ticket.getPNRNumber()) {}
			eachTicket=ticket;
			break;
		}
		updateInDataBase();
		return true;
	}
}
