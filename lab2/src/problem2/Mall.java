package problem2;

import java.util.Objects;

public class Mall extends Building {
	public int numberOfStores;
	
	public Mall() {}
	
	public Mall(int numberOfFloors, double areaOfBuilding, int numberOfStores) {
		super(numberOfFloors, areaOfBuilding);
		this.numberOfStores = numberOfStores;
	}
	
	public String toString() {
		return super.toString() + " and Mall has " + numberOfStores + " shopping stores";
	}
	
	public boolean equals(Object obj) {
		if(super.equals(obj)) {
			Mall b = (Mall)obj;
			return numberOfStores == b.numberOfStores;
		}
		return false;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), numberOfStores);
	}
}
