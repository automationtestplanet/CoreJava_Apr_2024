package exceptionhandling;

public class BankTransactionException extends Exception {
	
	public BankTransactionException() {
		System.out.println("Transaction failed");
	}
	
	public BankTransactionException(String message) {
		System.out.println(message);
	}
	
	
	public void toString(String str) {
		System.out.println(str);
	}

}
