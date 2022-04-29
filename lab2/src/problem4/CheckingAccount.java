package problem4;

public class CheckingAccount extends Account {
	private static final int FREE_TRANSACTIONS = 2;
	private static final double TRANSACTION_FEE = 0.02;
	private int transactionCNT;
	
	
	public CheckingAccount(int a) {
		super(a);
		transactionCNT = 0;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		transactionCNT++;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		transactionCNT++;
	}
	
	public void transfer(double amount, Account other) {
		super.transfer(amount, other);
		transactionCNT++;
	}
	
	public void deductFee() {
		if (transactionCNT > FREE_TRANSACTIONS) {
			int difference = transactionCNT - FREE_TRANSACTIONS;
			super.withdraw(difference * TRANSACTION_FEE);
			transactionCNT = 0;
		}
	}
}
