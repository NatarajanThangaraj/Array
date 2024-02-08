package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.createflight;

import java.util.ArrayList;
import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.BaseView;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;

public class CreateFlightView extends BaseView {
	CreateFlightViewModel flightViewModel;

	public CreateFlightView() {
		this.flightViewModel = new CreateFlightViewModel(this);
	}

	public void getSchdules() {
		List<Flight> flightList = new ArrayList<>();
		Flight flight;
		System.out.print(" Enter Number of Schdules : ");
		int n = getInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(" Schedule : " + i);
			flight = flightRoutes();
			flightList.add(flight);
		}
		flightViewModel.createFlightRoutes(flightList);
	}

	Flight flightRoutes() {
		Flight flight = new Flight();
		int n = 0;
		List<String> routeList = new ArrayList<>();
		System.out.print(" Enter Flight Number : ");
		flight.setFlightNumber(getInt());
		System.out.print(" Enter Flight Name : ");
		flight.setFlightName(getString());
		System.out.print(" Enter depature Time [HH:mm] : ");
		flight.setDepartTime(getString());
		System.out.print(" Enter Arrival Time [HH:mm] : ");
		flight.setArrivalTime(getString());
		System.out.print(" Enter Number of Seats : ");
		flight.setSeats(getInt());
		System.out.print(" Enter fare : ");
		flight.setFare(getInt());
		System.out.println(" Enter number of Routes");
		n = getInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(" Enter " + i + " city : ");
			String path = getString();
			routeList.add(path);
		}
		flight.setList(routeList);
		return flight;
	}

	public void successMessage() {
		System.out.println(" Flights added Successfully !!!");
		
	}
}
