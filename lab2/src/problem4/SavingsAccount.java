package problem4;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public SavingsAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		double interest = getBalance() * interestRate;
		deposit(interest);
	}
}
