package exceptionhandling;

public class UseBankTransactions {

	public static void main(String[] args) {
		BankTransactions sbi = new BankTransactions();
		
		sbi.deposit(AccountType.SAVINGS_ACCUNT,100000);
		sbi.displayBalance();
		
		sbi.withdrawl(150000);
		
		sbi.purchaseProduct(150000);
	}
}
