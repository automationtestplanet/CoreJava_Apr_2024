package iostreams;

import java.util.Scanner;

public class ScannerClassExample {
	
	static ScannerClassExample sce = new ScannerClassExample();

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------Please Enter Strng value---------------");
		String str1 = sc.next();
		
		System.out.println(str1);
		System.out.println(str1+ " Java");
		
		System.out.println("----------------Please Enter Integer value---------------");
		int a = sc.nextInt();
		System.out.println(a+100);
	}

}
