package stringclasses;

public class StringClasses {

	public static void main(String[] args) {

		int a = 10;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		System.out.println("----------------String-----------------------------------------");

		String str1 = "Hello"; // Once we initialized the String value into some memory location, that can not
								// be changed (Immutable)
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1.concat(" Java"); // new memory will be created and it becomes unreferenced (no variable name)
		System.out.println(str1);
		System.out.println(str1.hashCode());
		str1 = str1.concat(" Java");
		System.out.println(str1);
		System.out.println(str1.hashCode());

		int b = 20; // Primitive

		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = new String("Hello");

		StringClasses strCls = new StringClasses();

		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
//		System.out.println(str3 == str4.intern());		
		System.out.println(str3.equals(str4));
		
		System.out.println("----------------StringBuilder-----------We can ot use it for multi-threding process------------------------------");
		StringBuilder strBuilder = new StringBuilder("Hello");
		System.out.println(strBuilder);
		System.out.println(strBuilder.hashCode());
		strBuilder.append(" Java");
		System.out.println(strBuilder);
		System.out.println(strBuilder.hashCode());
		
		System.out.println("----------------StringBuffer----------------We can use it for multi-threding process-------------------------");
		StringBuffer strBuffer = new StringBuffer("Hello");
		System.out.println(strBuffer);
		System.out.println(strBuffer.hashCode());
		strBuffer.append(" Java");
		System.out.println(strBuffer);
		System.out.println(strBuffer.hashCode());

	}

}
