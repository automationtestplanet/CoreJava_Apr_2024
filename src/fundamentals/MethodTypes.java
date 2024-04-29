package fundamentals;

public class MethodTypes {

	// without parameters and without return
	static void addiion() {
		System.out.println(100 + 200);
	}

	// without parameters and with return
	static int addiion1() {
		return 100 + 200;
	}

	// with parameters and without return
	static void addiion2(int a, int b) {
		System.out.println(a + b);
	}

	// with parameters and with return
	static int addiion1(int a, int b) { // parameters
		return a + b;
	}

	static int addiion(int a, int b) {
		return a + b;
	}
	
	static int addiion(short a, short b) {
		return a + b;
	}
	
	static int addiion(int a, int b, int c) {
		return a + b;
	}
	
	static int substration(int a, int b) {
		return a - b;
	}
	
	static int multiplication(int a, int b) {
		return a * b;
	}
	
	static int division(int a, int b) {
		return a / b;
	}
	
	static int modDivision(int a, int b) {
		return a % b;
	}
	
	static int executeExpression(int a, int b, int c, int d, int e, int f) {
		return a+b-c*d/e%f;
	}

	public static void main(String[] args) {

//		int result1 = addiion();

		int result2 = addiion1();
		System.out.println(result2);

		addiion(100, 200);
		addiion(1000, 2000);
		addiion(10000, 20000);
		addiion(100000, 200000);

		int res1 = addiion1(100, 200); // arguments
		int res2 = addiion1(1000, 2000);
		int res3 = addiion1(10000, 20000);
		int res4 = addiion1(100000, 200000);

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		
		
//		a+b-c*d/e%f
		
		int reslt1 = addiion(100,200);
		
		int reslt2 = substration(reslt1,400);
		
		int reslt3 = multiplication(reslt2, 5);
		
	System.out.println(modDivision(division(multiplication(substration(addiion(100,200), 400), 5), 3) , 7));	

	System.out.println(executeExpression(100,200,400,5,3,7));
	
	
	
	
	
	}

}
