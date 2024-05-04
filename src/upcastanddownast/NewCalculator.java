package upcastanddownast;

public class NewCalculator extends Calculator {

	void addition(int a, int b) {
		System.out.println(a + b + 500);
	}

	void modDvision(int a, int b) {
		System.out.println(a % b);
	}

	static void addition(int a, int b, int c) {
		System.out.println(a + b + c + 500);
	}

	public static void main(String[] args) {
		Calculator calc = new NewCalculator(); // Upcasting

		calc.addition(10, 20);

		calc.addition(10, 20, 30);
		
		NewCalculator newCalc = (NewCalculator)calc;  // Downcasting
		
		newCalc.addition(10, 20, 30);
		
		
		newCalc.addition(100);
		newCalc.addition(10,20);
		newCalc.addition(10,20,30);
		newCalc.addition(10,20,30,40);
		newCalc.addition(10,20,30,40,50);
		newCalc.addition(10,20,30,40,50,60);
		newCalc.addition(10,20,30,40,50,60,70);

	}
}
