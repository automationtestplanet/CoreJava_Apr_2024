package fundamentals;

public class Operators {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
//		Arithmetic Operators +, -, *, /, %
	System.out.println("-----------------Arithmetic Operations----------------------");	
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
//		Assignment Operator  =, +=, -=, *=, /=, %=
		System.out.println("-----------------Assignment Operations----------------------");	
		int c = 300;
		System.out.println(c+=100);;   // c = c+100;
		System.out.println(c-=100); ;   // c = c-100
		System.out.println(c*=100); ;  // c = c*100;
		System.out.println(c /=100); ; // c = c/100;
		System.out.println(c %=100); ; // c = c%100;
		
		System.out.println(c);
		
		
//    Incremental/Decrement Operators  Pre / post    ++, --
		System.out.println("-----------------Incremental/Decrement Operations----------------------");	

		int d = 10;
		System.out.println(d++);  // 10
		System.out.println(d);   // 11		
		System.out.println(++d);   // 12
		
		
		System.out.println(d--);   // 12
		System.out.println(d);    // 11
		System.out.println(--d);   // 10
		
//	Comparison 	Operators   ==, <, >, <=, >=, !=
		
		System.out.println("-----------------Comparison Operations----------------------");	
		
		int e = 500;
		
		int f = 600;
		
		boolean  bool1 = e == f;
		
		System.out.println(bool1);
		
		System.out.println(e == f);
		System.out.println(e < f);
		System.out.println(e > f);
		System.out.println(e <= f);  // <  ==  T F  -> T
//		f = 500;
		System.out.println(e >= f);  // <  ==  F F  -> F		
		System.out.println(e != f);  // <  ==  T
		
//		Logical Operators &&, ||, !
		
		System.out.println("-----------------Logical Operations----------------------");	
		
		System.out.println( a == b && a <b && a>b && a!=b  );   // F T F T  -> F
		
		System.out.println( a == b || a <b | a>b || a!=b  );  // F T F T  -> T
		
		System.out.println( a == b || a <b || a>b || a!=b  );  // F T F T  -> T
		
//		F || T  -> T
//		
//		T || F -> T
//		
//		T || F -> T
		
		System.out.println( a == b || a <b || a>b && a!=b  );  // F T F T  -> T
		
//		F || T  -> T
//		
//		T || F -> T
//		
//		T || F -> T
		
//		T && T -> T
		
		System.out.println(!( a == b && a <b && a>b && a!=b ) );   // F T F T  -> T
		System.out.println(!( a == b || a <b || a>b && a!=b ) );  // F T F T  -> F
		
		
		// Ternary Operator  ? :
		
	System.out.println("-----------------------Ternary Operation------------------------");	
		
		
		System.out.println( e < f);
		
		System.out.println(e<f ? e : f);
		
		System.out.println(e<f ? true : false);
		
		boolean bool2 = e<f ? true : false;
		
		System.out.println(e<f ? 1000 : 2000);
		
		int a1 = e<f ? 1000 : 2000;
		
		System.out.println(e<f ? "E Less than F" : "F Greater than E");
		
		String str  = e<f ? "E Less than F" : "F Greater than E";

	}

}
