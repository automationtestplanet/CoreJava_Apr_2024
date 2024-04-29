package oops;

public class Transactions {

	private static int bankBalance = 0;

	public void deposit(String accountType, int depositAmount) {

		switch (accountType) {
		case "SAVINGS ACCOUNT":

			if (depositAmount <= 200000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Deposit Limit 200000");
			}
			break;
		case "CURRENT ACCOUNT":
			if (depositAmount <= 1000000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Deposit Limit 1000000");
			}

			break;

		case "RETAILER ACCOUNT":
			if (depositAmount <= 2000000) {
				bankBalance += depositAmount;
			} else {
				System.out.println("Deposit Limit 2000000");
			}
			break;
		default:
			System.out.println("Please select correct account type");
			break;
		}
	}

	protected void withdrawl(int withdrawlAmount) {

		if (withdrawlAmount < bankBalance) {
			bankBalance -= withdrawlAmount;
		} else {
			System.out.println("In-sufficient funds");
		}
	}
	
	void displayBalance() {
		System.out.println("Balancce: "+bankBalance);
	}

}
