package oops;

public class StringOperations {

	public static void main(String[] args) {
		
		String str1 = "Hello Javaa";  //[H,e,l,l,o, ,J, a,v, a]
		
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(6));
		
		System.out.println(str1.indexOf("o"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));		
		System.out.println(str1.indexOf("a", str1.indexOf("a")+1));	
		
		System.out.println(str1.substring(6, str1.length()));
		
		System.out.println(str1.concat(" Welcome")); 
//		str1 = str1.concat(" Welcome");
		System.out.println(str1);
		
		System.out.println(str1.equals("Welcome"));
		
		String str2 = "Hello Javaa";
		
		System.out.println(str1.equals(str2));
		
		String str3 = "hello javaa";
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println(str3.replace("hello","Welcome"));
		
		System.out.println(str3.replace("l","A"));
		
		System.out.println(str3.replaceAll("l","H"));
		
		String str4 = "Hello1234#$&$&$";
		
		System.out.println(str4.replaceAll("#","").replaceAll("&", "").replaceAll("\\$",""));
		
		System.out.println(str4.replaceAll("[^a-zA-Z0-9]",""));
		System.out.println(str4.replaceAll("[^a-zA-Z]",""));
		System.out.println(str4.replaceAll("[^0-9]",""));
		System.out.println(str4.replaceAll("[a-zA-Z0-9]",""));
		
		
		String str5 = "Hello Welcome to Java";
		
		String[] strArr1 =  str5.split(" ");
		
		System.out.println(strArr1.length);
		
		for(String eachStr:strArr1) {
			System.out.println(eachStr);
		}
		
		String str6 = "Hello";
		
		char[] charArr1 = str6.toCharArray();
		
		for(char eachChar:charArr1) {
			System.out.println(eachChar);
		}
		
		for(int i=0; i<str6.length();i++) {
			System.out.println(str6.charAt(i)); 
		}
		
		System.out.println(str5.contains("Welcome"));
		
		System.out.println(str5.startsWith("Hello"));
				
//		str1 = "Hello";		
//		str2 = new String("Hello");
//		
//		System.out.println(str1==str2);

	}

}

