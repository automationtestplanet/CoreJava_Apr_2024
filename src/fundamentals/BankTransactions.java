package fundamentals;

public class BankTransactions {
	
	static int bankBalance = 0;
	
	void deposit(AccountType accountType,int depositAmount) {	
		
		switch (accountType) {
		case SAVINGS_ACCUNT:
			
			if(depositAmount <= 200000) {
				bankBalance += depositAmount;	
			}else {
				System.out.println("Transaction failed, Deposit Limit 200000 only");
			}
			
			break;
		case CURRENT_ACCOUNT:
			if(depositAmount <= 1000000) {
				bankBalance += depositAmount;	
			}else {
				System.out.println("Transaction failed, Deposit Limit 1000000 only");
			}
			
			break;
			
		case RETAILER_ACCOUNT:
			if(depositAmount <= 2000000) {
				bankBalance += depositAmount;	
			}else {
				System.out.println("Transaction failed, Deposit Limit 2000000 only");
			}			
			break;
		default:
			System.out.println("Please select correct account type");
			break;
		}
		
			
	}
	
	void withdrawl(int withdrawlAmount){
		
		if(withdrawlAmount < bankBalance) {
			bankBalance -= withdrawlAmount;
		}else {
			System.out.println("In-sufficient funds");
		}
		
		
	}
	
	
	void displayBalance() {
		System.out.println("Balancce: "+bankBalance);
	}

	public static void main(String[] args) {
		BankTransactions sbi = new BankTransactions();
		
		sbi.deposit(AccountType.SAVINGS_ACCUNT,100000);
		sbi.displayBalance();
		
		BankTransactions icici = new BankTransactions();
		
		icici.withdrawl(5000);
		
		icici.displayBalance();
		
		
		icici.withdrawl(100000);
		
		icici.displayBalance();
		
		BankTransactions sbi2 = new BankTransactions();
		sbi2.deposit(AccountType.SAVINGS_ACCUNT,500000);
	}

}
