package CompareExample;

import java.util.Comparator;

public class NameComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		
		return (o1.name.compareTo(o2.name));
	}
	
}
