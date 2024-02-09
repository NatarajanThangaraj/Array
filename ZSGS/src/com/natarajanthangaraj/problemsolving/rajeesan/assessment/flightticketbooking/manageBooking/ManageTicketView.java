package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.manageBooking;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.BaseView;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Passenger;
import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Ticket;

public class ManageTicketView extends BaseView{
public ManageTicketViewModel manageViewModel;
public ManageTicketView() {
	this.manageViewModel=new ManageTicketViewModel(this);
}
public void cancelTicket() {
	System.out.print(" Enter PNR Number : ");
	int pnrNumber=getInt();
	Ticket ticket = manageViewModel.getTicketBasedOnPNRNumber(pnrNumber);
	System.out.print(" Do you want cancel the Ticket ? : ");
	String decision=getString();
	if(decision.equalsIgnoreCase("yes")) {
		ticket.setStatus("CANCEL");
		if(manageViewModel.putTicket(ticket)) {
			System.out.println(" Ticket Cancelled Successfully...");
		}
	}
}
public void searchPassanger() {
	System.out.println(" Enter passenger ID :  ");
	int passID=getInt();
	Passenger passenger=manageViewModel.getPassanger(passID);
	showPassenger(passenger);
}
public void changeTicketStatus() {
	System.out.print(" Enter PNR Number : ");
	int pnrNumber=getInt();
	Ticket ticket = manageViewModel.getTicketBasedOnPNRNumber(pnrNumber);
	System.out.println(" Enter Ticket status : ");
	System.out.println(" 1.CNF ");
	System.out.println(" 2.CANCEL ");
	System.out.print(" Enter option : ");
	ticket=manageViewModel.changeStatus(getInt(),ticket);

	if(ticket==null) {
		System.out.println(" invalid selection ");
	}else {
	showTicket(ticket);
	}
	}
	

}
