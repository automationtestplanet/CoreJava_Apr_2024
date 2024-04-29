package demo;

import oops.Transactions;

public class UseTransactions {

	public static void main(String[] args) {
		Transactions transaction = new Transactions();
		
		transaction.deposit("AVINGS ACCOUNT", 200000);  // public method
		
//		transaction.withdrawl(10000); // Protected method

	}

}
