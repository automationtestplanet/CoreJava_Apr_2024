package innerclasses;

abstract public class AbstractWithAnonymous {

	abstract void addition(int a, int b);

	public static void main(String[] args) {

		AbstractWithAnonymous absAno = new AbstractWithAnonymous() {
			@Override
			void addition(int a, int b) {
				System.out.println(a + b);
			}
		};
		
		absAno.addition(10, 20);

	}

}
