package innerclasses;

public interface InterfaceWithAnonymous {

	int a = 100; // public static final

	void addition(int a, int b);

	static void substraction(int a, int b) {
		System.out.println(a - b);
	}

	default void multiplication(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {

		InterfaceWithAnonymous.substraction(30, 5);

		InterfaceWithAnonymous intsAno = new InterfaceWithAnonymous() {
			@Override
			public void addition(int a, int b) {
				System.out.println(a + b);
			}
		};

		intsAno.addition(10, 20);

		System.out.println(InterfaceWithAnonymous.a);

//			InterfaceWithAnonymous.a = 200; // public static final value, we cannot change
		intsAno.multiplication(30, 5);

	}

}
