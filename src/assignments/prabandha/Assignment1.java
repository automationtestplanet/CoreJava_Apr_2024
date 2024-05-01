package assignments.prabandha;

public class Assignment1 {

	private static final int i = 0;
	//Write a reusable method check whether the string is Pallendrome or not
	public static  boolean Pallendrome(String str ){
		
		int n= str.length();
		
		//Compare characters from beginning and end 
		
		
		for( int i= 0;i<n/2;i++)
			
			if (str.charAt(i)!= str.charAt(n-i-1))
				
				return false;
		return true;
		
	}
	}

