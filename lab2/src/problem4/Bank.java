package problem4;
import java.util.*;

public class Bank {
	Vector<Account> accounts = new Vector<Account>();
	
	public void update() {
		for (Account account: accounts) {
			if (account instanceof CheckingAccount)
				((CheckingAccount)account).deductFee();
			else if (account instanceof SavingsAccount)
				((SavingsAccount)account).addInterest();
		}
	}
	
	public void open(Account a) {
		accounts.add(a);
		System.out.println("Account opened");
	}
	
	public void close(Account a) {
		accounts.remove(a);
		System.out.println("Account closed");
	}
	
}
