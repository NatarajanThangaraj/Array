package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto;

import java.io.Serializable;
import java.util.List;


public class Ticket implements Serializable {
private Flight flight;
private List<Passenger>list;
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public List<Passenger> getList() {
	return list;
}
public void setList(List<Passenger> list) {
	this.list = list;
}
}
