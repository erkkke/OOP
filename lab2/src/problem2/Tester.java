package problem2;

import java.util.HashSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building b1 = new Mall(2, 300, 100);
		Building b2 = new Mall(2, 300, 100);
		Building b3 = new ApartmentComplex(5, 700, 200);
		Building b4 = new ApartmentComplex(5, 700, 150);
		
//		Mall m1 = new Mall(3, 700, 25);
//		Mall m2 = new Mall(3, 800, 30);
		
		HashSet <Building> hs = new HashSet<Building>();
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(b3.equals(b4));
		System.out.println(hs.size());
	}

}
