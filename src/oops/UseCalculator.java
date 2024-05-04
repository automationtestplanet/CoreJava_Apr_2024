package oops;

import fundamentals.Calculator;

public class UseCalculator extends Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(10, 20);
//		calc.substraction(10, 5); // Protected content
		UseCalculator useCalc = new UseCalculator();
		useCalc.substraction(10, 5); // protected content
	}

}
