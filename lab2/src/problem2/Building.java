package problem2;

import java.util.Objects;

public abstract class Building {
	private int numberOfFloors;
	private double areaOfBuilding;
	
	public Building() {}
	
	public Building(int numberOfFloors, double areaOfBuilding) {
		this.numberOfFloors = numberOfFloors;
		this.areaOfBuilding = areaOfBuilding;
	}
	
	public String toString() {
		return "Building has " + numberOfFloors + " floors and its area is " + areaOfBuilding + "sq m";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		else if((obj == null) || (this.getClass() != obj.getClass()))
			return false;
		
		else {
			Building b = (Building)obj;
			return numberOfFloors == b.numberOfFloors && 
					areaOfBuilding == b.areaOfBuilding;
		}
	}
	
	public int hashCode() {
		return Objects.hash(numberOfFloors, areaOfBuilding);
	}
}
