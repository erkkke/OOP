package problem4;

import java.util.Date;

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Person p = new Person("A");
		
		Employee e = new Employee("B", 100, new Date(100), "1");
		Employee e1 = new Employee("C", 200, new Date(1000), "2");
		Employee e2 = new Employee("D", 300, new Date(1600), "3");
		
		Manager m = new Manager("E", 500, new Date(102600), "4");
		Manager m1 = new Manager("F", 400, new Date(1022600), "5");
		
		NameComparator nameComparator = new NameComparator();
		HireDateComparator dateComparator = new HireDateComparator();
		
		m.setBonus(100);
		m1.setBonus(500);
		
		
		m.addEmployeeToTeam(e);
		m.addEmployeeToTeam(e1);
		m1.addEmployeeToTeam(e2);
		
//		System.out.println(e.compareTo(e1));
	
		System.out.println(e1.equals(e2));
		e2 = (Employee)e1.clone();
//		e2.hireDate = new Date(129283);
		System.out.println(e1.equals(e2));
		
		
		System.out.println(m.compareTo(m1));
		
		
		m1 = (Manager) m.clone();
		
		m1.team.elementAt(0).name = "Z";
		m.getTeam();
		m1.getTeam();
		

//		System.out.println(m.compareTo(m1));
		
//		System.out.println(nameComparator.compare(m, m1));
	}

}
