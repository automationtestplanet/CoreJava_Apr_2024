package assignments.siva;

import java.util.Arrays;

public class Assignment3 {

//		Write a program to print No of vowels available in each word in given string
//		Ex: "Hello this is Java" -> Hello -> 2, this-1, is-1, Java-2 
	public static void main(String[] args) {

		String s = "Hello this is Java";
		int count = 0;
		System.out.println(s);
		String a[] = s.split(" ");

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a[i].length(); j++) {

				if (a[i].charAt(j) == 'a' || a[i].charAt(j) == 'e' || a[i].charAt(j) == 'i' || a[i].charAt(j) == 'o'
						|| a[i].charAt(j) == 'u') {

					count++;
				}

			}
			System.out.println(a[i] + "  no of vowels available: " + count);

			count = 0;

		}
		

	}
}
