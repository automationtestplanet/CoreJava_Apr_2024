package fundamentals;

public class Calculator {
	
	public void addition(int a, int b) {
		System.out.println(a + b);
	}

	protected void substraction(int a, int b) {
		System.out.println(a - b);
	}

	void multiplication(int a, int b) {  // Can not access outseide package
		System.out.println(a * b);
	}

	private void division(int a, int b) { // Can not access out side the class
		System.out.println(a / b);
	}

}
