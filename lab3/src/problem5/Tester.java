package problem5;

//import java.util.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate c1 = new Chocolate("Kazahstan", 100);
		Chocolate c2 = new Chocolate("Merci", 190);
		Chocolate c3 = new Chocolate("Alpen Gold", 120);
		Chocolate c4 = new Chocolate("Kit-Kat", 110);
		
		Time t1 = new Time(11, 11, 12);
		Time t2 = new Time(11, 11, 3);
		Time t3 = new Time(1,54,35);
		Time t4 = new Time(11,25,18);
		
		Chocolate[] chocolates = new Chocolate[] {c1, c2, c3, c4};
		Time [] timeList = new Time [] {t1, t2, t3, t4};
		
//		Sort.bubbleSort(chocolates);
		Sort.quickSort(chocolates);
		
		for (Chocolate choco: chocolates) {
			System.out.println(choco);
		}
		
		System.out.println();
		
		Sort.quickSort(timeList);
		
		for (Time time: timeList) {
			System.out.println(time);
		}
	}

}
