package assignments.gopi;

public class Assignment2 {

//	Write a program to print No of owels availble in each word in given string
//	Ex: "Hello this is Java" -> Hello -> 2, this-1, is-1, Java-2 

	public static void main(String[] args) {

		int Count = 0;

		String str = "Hello this is Java";

		
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				Count++;
			}
		}
		System.out.println("Number of vowels in "+str + " -> "+ Count);
		
	}
}
