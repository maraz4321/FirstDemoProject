package util;

public class BankForCucumber {


	int balance ;
	public BankForCucumber(int t) {
		balance = t;
	}
	public  void  deposit(int d) {
		balance = balance + d ;

	}
	public  void withdrow(int w) {
		balance = balance - w ;
	}

	public int   getBalance() {

		return balance;

	}

}
