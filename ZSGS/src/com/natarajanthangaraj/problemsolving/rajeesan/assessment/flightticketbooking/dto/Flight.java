package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto;

import java.io.Serializable;
import java.util.List;


public class Flight implements Serializable {
	private int flightNumber;
	private String flightName;
	private String departTime;
	private String arrivalTime;
	private List<String> list;
	private int seats;
	private int fare;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartTime() {
		return departTime;
	}

	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
}
