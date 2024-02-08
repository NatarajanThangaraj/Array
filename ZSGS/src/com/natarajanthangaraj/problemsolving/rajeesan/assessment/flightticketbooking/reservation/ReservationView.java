package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.reservation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;

public class ReservationView {
 public ReservationViewModel reserveViewModel;
 public ReservationView() {
	 this.reserveViewModel=new ReservationViewModel(this);
 }
public  void showAllRoutes() {
	 Set<String>flightSet=new HashSet<>();
	 List<String> routes;
	 List<Flight>flightList=reserveViewModel.getAllFlights();
	 for(Flight flight:flightList) {
		 routes=flight.getList();
		 for(String city:routes) {
			 flightSet.add(city);
		 }
	 }
	// System.out.println(flightList);
	 System.out.println("\n THE ALL ROUTES OF FLIGHT \n");
	 int n=1;
	 for(String city : flightSet) {
		 System.out.println(n+"  "+city);
	 }
 }
}
