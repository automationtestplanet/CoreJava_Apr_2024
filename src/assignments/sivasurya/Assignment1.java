package assignments.sivasurya;

public class Assignment1 {


	public static void testPalindrome(String s)
	{
		int strLength = s.length();
		String revStr = "";
	    for (int i = (strLength - 1); i >=0; --i) {
	      revStr = revStr + s.charAt(i);
	    }

	    if (s.toLowerCase().equals(revStr.toLowerCase())) {
	      System.out.println("The given String :" + s + " is palindrome");
	    }
	    else {
	      System.out.println("The given String :" + s + " is not palindrome");
	    }
	}
	
	public static void main(String[] args) {
		
		
		String str = "level";
	    
		Assignment1 tp =new Assignment1();
		
		tp.testPalindrome(str);
		
	
}
}


