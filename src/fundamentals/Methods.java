package fundamentals;

public class Methods {
	
	static void addition(){
		
		int a =10000;
		int b =20000;
		System.out.println(a+b);
	}
	
	static int addition1(){
		
		int a =10000;
		int b =20000;
		return a+b;
	}
	
	
	static void addition(int a, int b){
		System.out.println(a+b);
	}
	
	static long addition(long a, long b){
		return a+b;
	}
	
	static void substraction(int a, int b){
		System.out.println(a-b);
	}
	
	static void multiplication(int a, int b){
		System.out.println(a*b);
	}
	
	static void division(int a, int b){
		System.out.println(a/b);
	}
	
	static void modDivisio(int a, int b){
		System.out.println(a%b);
	}
	

	public static void main(String[] args) {
//		addition();
		
		addition(100000,200000);
		
//		a+b-c*d/e%f
		long result = addition(10L,20L);
		System.out.println(result);	

	}

}
