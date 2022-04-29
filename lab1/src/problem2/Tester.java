package problem2;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane plane = new Plane("Boing", "Air Astana", "Vienna", 100);
		
		plane.addPassenger(new Passenger("Passanger A", FlightClass.BUSINESS));
		plane.addPassenger(new Passenger("Passanger B", FlightClass.ECONOMY));
		plane.addPassenger(new Passenger("Passanger C", FlightClass.ECONOMY));
		plane.addPassenger(new Passenger("Passanger D", FlightClass.BUSINESS));
		plane.addPassenger(new Passenger("Passanger E", FlightClass.FIRST));
		plane.addPassenger(new Passenger("Passanger F", FlightClass.ECONOMY));
		plane.addPassenger(new Passenger("Passanger G", FlightClass.FIRST));
		
		System.out.println(plane.getFlightInfo());
		
		plane.getPassengersInfo();
		plane.getPassengerInfo(0);
		
		
	}

}
