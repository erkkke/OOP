package problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
	protected double salary;
	protected Date hireDate;
	protected String insuranceNumber;
	
	public Employee() {}
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public String toString() {
		return super.toString() + 
				", salary: " + salary + 
				", hire date: " + hireDate + 
				", insurance number: " + insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o))
			return false;
		Employee e = (Employee) o;
		return (salary == e.salary) && (hireDate.equals(e.hireDate)) && (insuranceNumber.equals(e.insuranceNumber));
	}

	@Override
	public int compareTo(Employee o) {
		if (salary > o.salary)
			return 1;
		else if (salary < o.salary)
			return -1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
		Employee clone = (Employee) super.clone();
		clone.hireDate = (Date) hireDate.clone();
		return clone;
	}
	
}
