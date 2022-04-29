package problem4;

public class Tester {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account acc1 = new SavingsAccount(1, 0.1);
		Account acc2 = new CheckingAccount(2);
		
		bank.open(acc1);
		bank.open(acc2);
		
		acc1.deposit(5);
		acc1.transfer(0.5, acc2);
		acc1.transfer(1, acc2);
		acc1.transfer(3, acc2);
		bank.update();
		acc1.print();
		acc2.print();
	}

}
