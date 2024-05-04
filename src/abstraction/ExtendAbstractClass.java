package abstraction;

public class ExtendAbstractClass extends Calculator {

	public ExtendAbstractClass(int a, int b) {
		super(a, b);
	}

	@Override
	protected void addition(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	protected void substraction(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Calculator calc = new ExtendAbstractClass(100,3);
		
		calc.addition(10, 20);
		
		calc.modDivision();

	}

}
