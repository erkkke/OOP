package CompareExample;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Laptop l = new Macbook("l1", 1000, "Intel");
//		Laptop l1 = new Macbook("l2", 1500, "Intel");
//		Laptop l2 = new Macbook("l3", 2000, "AMD");
//		Laptop l3 = new Macbook("l4", 500, "m1");
//		Laptop l4 = new Macbook("l5", 1000, "AMD");
//		
//		Vector<Laptop> laptops = new Vector<Laptop>();
//		laptops.add(l);
//		laptops.add(l1);
//		laptops.add(l2);
//		laptops.add(l3);
//		laptops.add(l4);
//		
////		Collections.sort(laptops, new NameComparator());
//		Collections.sort(laptops);
		
//		System.out.println(laptops);
		
		HashMap<String, String> capitalCities = new HashMap<String,  String>();
	    capitalCities.put("England", "London");
	    capitalCities.put("England", "Liverpool");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities.get("England"));
	    
	}

}
