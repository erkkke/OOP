package problem4;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2) {
		return o1.getHireDate().compareTo(o2.getHireDate());
	}

}
