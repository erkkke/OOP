package problem2;

import java.util.Objects;

public class ApartmentComplex extends Building{
	public int numberOfApartments;
	
	public ApartmentComplex(int numberOfFloors, double areaOfBuilding, int numberOfApartments) {
		super(numberOfFloors, areaOfBuilding);
		this.numberOfApartments = numberOfApartments;
	}
	
	public String toString() {
		return super.toString() + " and Apartment complex has " + numberOfApartments + " apartments";
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			ApartmentComplex b = (ApartmentComplex)obj;
			return numberOfApartments == b.numberOfApartments;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), numberOfApartments);
	}
}
