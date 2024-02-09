package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.appllication;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.createflight.CreateFlightView;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.manageBooking.ManageTicketView;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.reservation.ReservationView;

public class ApplicationViewModel {
 ApplicationView appicationView;
 ReservationView reserveView;
 CreateFlightView createFlightView;
 ManageTicketView manageView;
 public ApplicationViewModel(ApplicationView applicationView) {
	 this.appicationView=applicationView;
	 this.reserveView=new ReservationView();
	 this.createFlightView=new CreateFlightView();
	 this.manageView=new ManageTicketView();
 }
public void actionListener(int select) {
	System.out.println("\n");
	switch(select) {
	case 1->{
		reserveView.requiredTrip();
	}
	case 2->{
		reserveView.getTicketUsingPNRNumber();
	}
	case 3->{
		reserveView.showAllTicket();
	}
	case 4->{
		manageView.cancelTicket();
	}
	case 5->{
		manageView.searchPassanger();
	}
	case 6->{
		manageView.changeTicketStatus();
	}
	case 7->{
		reserveView.showAllRoutes();
	}
	case 8->{
		createFlightView.getSchdules();
	}
	}
	
}
 
}
