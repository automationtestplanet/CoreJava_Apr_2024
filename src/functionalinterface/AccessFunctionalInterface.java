package functionalinterface;

public class AccessFunctionalInterface {

	public static void main(String[] args) {
		
		FunctionalInterface1 funInf1 = new FunctionalInterface1() {			
			@Override
			public void addition(int a, int b) {
				System.out.println(a+b);				
			}
		};
		
		funInf1.addition(30, 40);
		
		FunctionalInterface1 funInf2 = (a,b)->{System.out.println(a+b);};  // Lambda Expression
		
		funInf2.addition(100, 200);
		
	}
}
