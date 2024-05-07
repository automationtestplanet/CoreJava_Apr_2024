package exceptionhandling;

public class BankTransactions {

	static int bankBalance = 0;

	void deposit(AccountType accountType, int depositAmount) {
		switch (accountType) {
		case SAVINGS_ACCUNT:
			if (depositAmount <= 200000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Transaction failed, Deposit Limit 200000 only");
			}
			break;
		case CURRENT_ACCOUNT:
			if (depositAmount <= 1000000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Transaction failed, Deposit Limit 1000000 only");
			}
			break;
		case RETAILER_ACCOUNT:
			if (depositAmount <= 2000000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Transaction failed, Deposit Limit 2000000 only");
			}
			break;
		default:
			System.out.println("Please select correct account type");
			break;
		}
	}

	void withdrawl(int withdrawlAmount) {
		if (withdrawlAmount < bankBalance) {
			bankBalance -= withdrawlAmount;
		} else {
			System.out.println("In-sufficient funds");
		}
	}

	void displayBalance() {
		System.out.println("Balancce: " + bankBalance);
	}
	
	void purchaseProduct(int purchaseAmount){
		
		try {
		if (purchaseAmount < bankBalance) {
			bankBalance -= purchaseAmount;
		} else {
			throw new BankTransactionException("Insufficent funds");
		}
		
		System.out.println("Generate Invoice");
		System.out.println("Invoice Number: "+ 123456);
		}catch(BankTransactionException e) {
			e.toString("Insufficient Balance");
		}
	}
}
