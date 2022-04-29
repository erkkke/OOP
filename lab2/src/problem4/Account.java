package problem4;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	
	public void withdraw(double sum) {
		if (sum > balance) {
			System.out.println("You do not have enough balance!");
			return;
		}
		
		balance -= sum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if (balance < amount) {
			System.out.println("You do not have enough balance!");
			return;
		}
		other.deposit(amount);
		this.withdraw(amount);
	}
	
	public String toString() {
		return "\nAccount number: " + accNumber + "\nBalance: " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
