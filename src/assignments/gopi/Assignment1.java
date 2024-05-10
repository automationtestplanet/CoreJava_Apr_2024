package assignments.gopi;

public class Assignment1 {

//	Write a reusable method to reverse a string without changing the special characters positions
//	Ex: i/p:   "hello@this#is&java"   -> o/p:   avajs@isih#to&lleh

	public static void rev(char string[]) {

		int a = string.length - 1;
		int b = 0;

		while (b < a) {

			if (!Character.isAlphabetic(string[b]))
				b++;
			else if (!Character.isAlphabetic(string[a]))
				a--;

			else {
				char tmp = string[b];
				string[b] = string[a];
				string[a] = tmp;
				b++;
				a--;
			}
		}
	}

	public static void main(String[] args) {
		String string = "hello@this#is&java";
		char[] charArray = string.toCharArray();

		System.out.println("Input string: " + string);
		rev(charArray);
		String revStr = new String(charArray);

		System.out.println("Output string: " + revStr);
	}
}
