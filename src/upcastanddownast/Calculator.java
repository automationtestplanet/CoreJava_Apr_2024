package upcastanddownast;

public class Calculator {

	void addition(int a, int b) {
		System.out.println(a + b);
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

	static void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	// varargs

	void addition(int... a) {

		int sum = 0;

		for (int eachNum : a) {
			sum += eachNum;
		}
		System.out.println(sum);
	}

}
