package functionalinterface;

public class MethodReferences {

	static void substraction(int a, int b) {
		System.out.println(a - b);
	}

	void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {

		FunctionalInterface1 fun1 = (a, b) -> {
			System.out.println(a + b);
		};
		fun1.addition(40, 50);

//		 static method reference

		FunctionalInterface1 fun2 = MethodReferences::substraction;

		fun2.addition(10, 20);

		MethodReferences methodRef = new MethodReferences();

		FunctionalInterface1 fun3 = methodRef::multiplication;

		fun3.addition(10, 30);

	}

}
