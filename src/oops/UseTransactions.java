package oops;

public class UseTransactions {

	public static void main(String[] args) {
		Transactions transactions = new Transactions();
		
//		transactions.deposit("SAVINGS ACCOUNT", 100000);		
		transactions.displayBalance();
		
//		transactions.bankBalance = 0;
		
		transactions.withdrawl(1500000);
	}

}
