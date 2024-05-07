package exceptionhandling;

import java.io.IOException;

public class UnCheckedExceptions {
	
	void division(int a,int b){
		System.out.println(a/b);
	}

	public static void main(String[] args) throws Throwable {
		int a = 100;
		int b = 0;

		String str = null;
		UnCheckedExceptions chkE = new UnCheckedExceptions();
		
		
		System.out.println("Execution Started");

		try {
			chkE.division(a,b);
		} catch (NullPointerException are) {
			System.out.println(are.getMessage());
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		
		
		try {
			chkE.division(a,b);
		} catch (NullPointerException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			chkE.division(a,b);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			chkE.division(a,b);
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		try {
//			chkE.division(a,b);
//			Thread.sleep(10000);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}catch(ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//		}
		
//		try {
//			chkE.division(a,b);
//			Thread.sleep(10000);
//		} catch (Exception | ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			chkE.division(a,b);
//			Thread.sleep(10000);
//		} catch (ArithmeticException | Exception e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Datbase Opened");
		
		String str2 = null;
		
		try {		
			System.out.println(str2.toUpperCase());
			
			System.out.println(100/0);
		}catch(Exception e ) {
			
		}finally {
			System.out.println("Datbase Closed");
		}
		
	
//		chkE.finalize();
		
		chkE.division(100, 3);
		
		System.out.println();
		System.out.println();
		
		
		
		String str3 = "Hello Java";
		
		str3 = "Java";
		
		System.out.println("Execution Ended");

	}

}
