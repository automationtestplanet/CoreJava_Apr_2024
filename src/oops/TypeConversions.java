package oops;

public class TypeConversions {
	
	public static int substraction(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		
		long result1 = substraction(1000,999); //1   // 4 bytes // 1  byte // Implicit type Conversion
		
		byte result2 = (byte)substraction(1000,999);  // explicit type conversion
		
		
		int a = 1000;
		
		byte b = (byte)a;
		
		// -128 to +127
		
		System.out.println(b);
		
		
		float f1 = a;   // 
		
		float f2 = 100.5F;
		
		int int1 = (int)f2;  // 100 -> it will ignore 0.5 value -> data loss
		
		System.out.println(f1);
		
		System.out.println(int1);
		
		
		long l1 = 1000000000000000000L;
		
		double d1 = l1;
		
		
		double d2 = 10000.82462E5;
		
		long l2 = (long)d2;
		
		System.out.println(l2);
		
		short s1 = (byte)a;
		
		char ch = 'A';
		
		byte byte1 = (byte)ch;
		
		short short2 = (short)ch;
		
		int int2 = ch;
		
		int int3 = 100;
		
		char ch2 =  (char)int3;
		
		System.out.println(ch+10);
		
		System.out.println(ch);
		System.out.println(ch2);
		
		
		String str = "10";
		
		System.out.println(str);
		
//		int int4 = (int)str;
		
		int int5 = 10;
		
//		String str2 = int5;
		
		
		
		
	}

}
