package exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int a = 100;
		
		int b = 1;
		
		System.out.println("Execution Started");
		
		try {
			System.out.println(a/b);
		
		}catch(ArithmeticException are) {
//			System.out.println(a/1);
			
			System.out.println(are.getMessage());
		}
		
		System.out.println("Execution Ended");

	}

}
