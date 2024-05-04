package abstraction;

abstract public class Calculator {

	
	int a, b;
	
	
	/**
	 * Description: This method performs addition on two numbers
	 * @param a
	 * @param b
	 */
	abstract protected void addition(int a, int b);
	
	abstract protected void substraction(int a, int b);

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	void division(int a, int b) {
		System.out.println(a / b);
	}
	
	void modDivision() {
		System.out.println(a % b);
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
