package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.createflight;

import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository.Repository;

public class CreateFlightViewModel {
	CreateFlightView createFlightView;
	public CreateFlightViewModel(CreateFlightView createFlightView) {
		this.createFlightView=createFlightView;
	}
	public void createFlightRoutes(List<Flight> flightList) {
		if(Repository.getInstance().createFlightRoutes(flightList)) {
			createFlightView.successMessage();
		}
	}

}
