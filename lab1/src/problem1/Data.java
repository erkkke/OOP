package problem1;

public class Data {
	private double maxi;
	private double average;
	private int size;
	
	public Data() {
	}
	
	public void add(double value) {
		if (value > maxi)
			maxi = value;
		
		double sumOfValues = average * size + value;
		size++;
		average = sumOfValues / size;
	}
	
	public double getMaxi() {
		return maxi;
	}
	
	public double getAverage() {
		return average;
	}
	
}
