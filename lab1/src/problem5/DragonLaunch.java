package problem5;

import java.util.Vector;

public class DragonLaunch {
	Vector<Person> launchList = new Vector<Person>();
	
	public DragonLaunch() {
		
	}
	
	void kidnap(Person p) {
		launchList.add(p);
	}
	
	boolean willDragonEatOrNot() {
		int cnt = 0;
		int pair = 0;
		
		for (Person i: launchList) {
//			if (i.toString() == "BOY")
			if (i.getGender() == Gender.BOY)
				cnt++;
			else 
				if (cnt > 0) {
					cnt--;
					pair++;
				}
		}
		return pair * 2 == launchList.size();
	}
	
	
}
