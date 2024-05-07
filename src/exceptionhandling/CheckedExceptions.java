package exceptionhandling;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException{
		
//		nit a = 100;
//		a int = 100;		
//		100 = a int;
		
		int a = 100;
		
		System.out.println("Execution STarted");
		
//		try {
//			Thread.sleep(10000);
//		}catch(InterruptedException ie) {
//			
//		}
		
		Thread.sleep(10000);
		
		System.out.println(a);
		
		System.out.println("Execution Ended");

	}

}
