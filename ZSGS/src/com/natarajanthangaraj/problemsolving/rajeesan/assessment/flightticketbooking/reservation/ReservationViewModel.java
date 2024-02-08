package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.reservation;

import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository.Repository;

public class ReservationViewModel {
	ReservationView reserveView;
	public ReservationViewModel(ReservationView reservationView) {
		this.reserveView=reservationView;
	}
	public List<Flight> getAllFlights() {
		return Repository.getInstance().getAllFlight();
	}

}
