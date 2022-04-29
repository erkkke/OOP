package problem3;

public class TemperatureTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature first = new Temperature();
		Temperature second = new Temperature(100, 'C');
		System.out.println(second.getDegreesF());
		first.setScale('F');
		first.setTemperature(100);
		System.out.println(first.getScale() + " " + first.getDegreesC());
	}

}
