package inheritance;

public class UseCalculator {

	public static void main(String[] args) {
		
		NewCalculator calc = new NewCalculator();
		
		System.out.println(calc.a);
		System.out.println(calc.b);
		calc.addition(10, 20);
		calc.modDivision(100, 3);

	}

}
