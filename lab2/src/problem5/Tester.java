package problem5;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		
		Circuit f = new Series(a, b);
		Circuit g = new Parallel(c, d);
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f);
		double R = circuit.getResistance();
		System.out.println(R);
		circuit.applyPotentialDiff(6);
		double V = circuit.getPotentialDiff();
		System.out.println(V);
		
		System.out.println("Power: " + circuit.getPower());
		System.out.println("Current: " + circuit.getCurrent());
	}

}
