package oops;

public class LocalVsGlobal {
	
	final int a =1000;
	final int b=2000;
	
	public void printNumbers() {
		int a = 100; int b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers3() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers4() {
		int a = 100; int b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers5(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers2(int c, int d, int e) {
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

	
	public void printNumbers1() {
		int c= 300;
		int d = 400;
		int e = 500;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public void printNumbers7(final int a, final int b) {
//		a = 100; b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	public void printNumbers8() {
		final int a = 100; final int b = 200;
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		int a = 100; int b = 200;	
		
		LocalVsGlobal var = new LocalVsGlobal();
		
//		var.printNumbers(a, b);
		
//		int a = 300;
		
		int d;
		
//		System.out.println(d);
		
//		var.printNumbers2(10,20,30);
		
		var.printNumbers();
		var.printNumbers3();
		
		
//		var.a = 10000;
//		var.b = 20000;
		
		System.out.println(var.a);
		System.out.println(var.b);
		
		var.printNumbers7(10, 20);
		
		
	}

}
