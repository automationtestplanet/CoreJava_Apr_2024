package assignments.srinath;

import java.util.Scanner;

public class Assignment2 {

//	Write a program to print No of vowels available in each word in given string
//	Ex: "Hello this is Java" -> Hello -> 2, this-1, is-1, Java-2 

	
	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a string: ");

		String str = sc.nextLine();
		System.out.println("You have entered: " + str);
     
		
		 char[] c =str .toCharArray(); int vowel=0;
		  
		 for (int i = 0; i < str.length(); i++) { if(str.charAt(i)=='a' ||
		 str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||
		 str.charAt(i)=='u') vowel++; }
		 
		
		System.out.println("Vowels: " + vowel);
		
	}
}





