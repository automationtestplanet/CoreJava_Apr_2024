package oops;

public class EncpasulationExample {
	//Global
	static  int a =100; 
	static  int b = 200;

	int e = 400;
	int f = 500;
	
	static void addition() {	
		int a =100; int b = 200; // local
		System.out.println(a+b);
	}
	
	void addition1() {		
		System.out.println(a+b);
		
		System.out.println(e);
		System.out.println(f);
	}
	
	
	static void substraction() {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		
		System.out.println(a+b);
		
		addition();
		substraction();
		
//		System.out.println(e);
//		System.out.println(f);
//		
		
		EncpasulationExample encapEx = new EncpasulationExample();
		
		System.out.println(encapEx.e);
		System.out.println(encapEx.f);
		
		
		EncpasulationExample encapEx2 = new EncpasulationExample();
		
		System.out.println(encapEx2.e);
		System.out.println(encapEx2.f);
		
	}

}
