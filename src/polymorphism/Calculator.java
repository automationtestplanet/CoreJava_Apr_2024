package polymorphism;

public class Calculator {

	void addition(int a, int b) {
		System.out.println(a + b);
	}
	
	void addition(String a, String b) {
		System.out.println(a + b);
	}
	
	void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void substraction(int a, int b) {
		System.out.println(a - b);
	}

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	void division(int a, int b) {
		System.out.println(a / b);
	}
	
	int addition1(int a, int b, int c) {
		return a + b + c;
	}
	
	int addition1(int a, int b) {
		return a + b;
	}
	
	

}
