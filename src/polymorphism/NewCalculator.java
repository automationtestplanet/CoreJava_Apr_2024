package polymorphism;

public class NewCalculator extends Calculator {

	void addition(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}

	int addition1(int a, int b, int c, int d) {
		return addition1(a, b, c) + d;
	}

	int addition1(int a, int b) {
		return super.addition1(a, b) + 5;
	}

	void addition(int a, int b) {
		System.out.println(a + b + 500);
	}

	void modDvision(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		NewCalculator newCalc = new NewCalculator();

		newCalc.addition(10, 20, 30, 40);

		System.out.println(newCalc.addition1(10, 20, 30, 40));

		System.out.println(newCalc.addition1(10, 20));

		newCalc.addition(10, 20);

		newCalc.modDvision(10, 3);

		newCalc.substraction(10, 5);

		Calculator calc = newCalc; // Upcasting

//		calc.modDvision(10, 3);  //can not access child class data
//		
		calc.addition(10, 20);

		int a = 100;

		long l = a;

		newCalc = (NewCalculator) calc; // down casting

		a = (int) l;

	}
}
