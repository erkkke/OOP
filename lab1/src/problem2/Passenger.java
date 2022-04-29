package problem2;

public class Passenger {
	private String name;
	private FlightClass flightClass = FlightClass.ECONOMY;
	private int passengerId;
	static int passengerNextId = 0;
	private double ticketPrice;
	
	{
		passengerId = passengerNextId++;
	}
	
	public Passenger(String name, FlightClass flightClass) {
		this.name = name;
		this.flightClass = flightClass;
	}
	
	FlightClass getFlightClass() {
		return flightClass;
	}
	
	int getPassengersId() {
		return passengerId;
	}
	
	void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	double getTicketPrice() {
		return ticketPrice;
	}
	
	public String toString() {
		return name;
	}
	
	
}
