package com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.repository;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.natarajanthangaraj.problemsolving.rajeesan.assessment.flightticketbooking.dto.Flight;

public class Repository implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3616973248033900905L;
	private List<Flight>allFlights;
	private static Repository repository;
	private final String flightURL = "C:\\Users\\ELCOT\\eclipse-workspace\\ZSGS\\ZSGS\\src\\com\\natarajanthangaraj\\problemsolving\\rajeesan\\assessment\\flightticketbooking\\repository\\Flight.ser";
	private Repository() {
		allFlights=new ArrayList<>();
	}
	public static Repository getInstance() {
		if (repository == null) {
			repository = new Repository();
		}
		return repository;
	}

	public boolean createFlightRoutes(List<Flight> listOfFlights) {
		try {
			FileOutputStream fos = new FileOutputStream(flightURL);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			listOfFlights.addAll(getAllFlight());
			allFlights=listOfFlights;
//			for (Flight flight : listOfFlights) {
//				allFlights.add(flight);
//			}
			System.out.println(allFlights);
			oos.writeObject(allFlights);
			oos.flush();
			oos.close();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	
	@SuppressWarnings({ "unchecked"})
	public List<Flight> getAllFlight() {
		List<Flight> flights = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(flightURL);
			ObjectInputStream ois = new ObjectInputStream(fis);
			try {
					flights=(List<Flight>)ois.readObject();
			}catch(EOFException e) {
				System.out.println();
			}
			       ois.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
		// System.out.println(flights);
		return flights;
	}
}
