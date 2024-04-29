package oops;

public class WrapperClasses {

	public static void main(String[] args) {
		byte b = 100;		
		Byte byt1 = 100;
		System.out.println(b == byt1);		
		b = byt1;		
		byt1 = b;	
		
		String str = "10";
//		int int1 = (int)str;
		
		System.out.println(str+10);
		
		int int1 = Integer.parseInt(str);  // Non- Primitive to primitive
		
		System.out.println(int1+10);
		
		byte byte1 = Byte.parseByte(str);  // Non- Primitive to primitive
		
		
		int int2 = 500;
		
//		String str2 = int2;
		
		String str2 = String.valueOf(int2); // primitive to Non-primitive
		
		String str3 = "A";
		
		char ch2 = str3.toCharArray()[0];
		
	}

}
