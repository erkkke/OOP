package problem2;

import java.util.Vector;

public class Plane {
	private String planeName, company, destination;
	final double mainPrice;
	Vector<Passenger> passengers = new Vector<Passenger>();
	
	Plane(String name, String company, String destination, double mainPrice) {
		this.planeName = name;
		this.company = company;
		this.destination = destination;
		this.mainPrice = mainPrice;
	}
	
	void addPassenger(Passenger p) {
		switch (p.getFlightClass()) {
		case ECONOMY:
			p.setTicketPrice(mainPrice);
			break;
		case BUSINESS:
			p.setTicketPrice(mainPrice + (mainPrice * 0.3));
			break;
		case FIRST:
			p.setTicketPrice(mainPrice + (mainPrice * 0.7));
			break;
		}
		
		passengers.add(p);
	}
	
	
	void getPassengersInfo() {
		for (Passenger i: passengers) {
			System.out.println("Passenger name: " + i + "\nflight class: " + i.getFlightClass() + "\nticket price: " + i.getTicketPrice() + "\npassenger id: " + i.getPassengersId() + "\n");
		}
	}
	
	void getPassengerInfo(int passengerId) {
		Passenger i = passengers.get(passengerId);
		System.out.println("Passenger name: " + i + "\nflight class: " + i.getFlightClass() + "\nticket price: " + i.getTicketPrice() + "\npassenger id: " + i.getPassengersId() + "\n");
	}
		
	String getFlightInfo() {
		return "Plane is " + planeName + ", company is " + company + ", destination is " + destination;
	}
	
	
	
	
	
}
