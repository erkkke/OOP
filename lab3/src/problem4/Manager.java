package problem4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee  {
	protected Vector<Employee> team = new Vector<Employee>();
	protected double bonus;
	
	public Manager() {}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void addEmployeeToTeam(Employee employee) {
		team.add(employee);
	}
	
	public void removeEmployeeFromTeam(Employee employee) {
		team.remove(employee);
	}
	
	public void getTeam() {
		for (Employee i: team) {
			System.out.println(i);
		}
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o))
			return false;
		Manager m = (Manager) o;
		return bonus == m.bonus;
	}
	
	@Override
	public int compareTo(Employee o) {
		Manager m = (Manager) o;
		if (super.compareTo(m) == 0) {
			if (bonus > m.bonus)
				return 1;
			else if (bonus < m.bonus)
				return -1;
			return 0;
		}
		return super.compareTo(m);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager clone = (Manager) super.clone();
		clone.team = (Vector<Employee>) team.clone();
		clone.team.removeAllElements();
		for (Employee i: team) {
			clone.team.add((Employee)i.clone());
		}

		return clone;
	}
	
	public String toString() {
		return super.toString() + ", bonus: " + bonus;
	}
	
}
