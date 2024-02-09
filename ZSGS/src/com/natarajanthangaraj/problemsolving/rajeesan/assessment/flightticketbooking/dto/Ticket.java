package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto;

import java.io.Serializable;
import java.util.List;


public class Ticket implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Flight flight;
private List<Passenger>list;
private int PNRNumber;
private String status="Booked";
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
public int getPNRNumber() {
	return PNRNumber;
}
public void setPNRNumber(int pNRNumber) {
	PNRNumber = pNRNumber;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
