package oops;

public class InterviewQuestions {

	public static void sumOfNums(String str1) {
		int sum = 0;
		for (char eachChar : str1.replaceAll("[^0-9]", "").toCharArray()) {
//			System.out.println(eachChar);
			sum += eachChar - '0';
		}
		System.out.println(sum);
	}

	public static void countOccurancesOfWord(String str2) {
		int count = 0;
		for (String eachStr : str2.split(" ")) {
			for (String eachStr2 : str2.split(" ")) {
				if (eachStr.equals(eachStr2))
					count++;
			}
			if (count > 1) {
				System.out.println(eachStr + " repeated " + count + " times");
			}

			str2 = str2.replaceAll(eachStr, "").trim();
			count = 0;
		}
	}

	public static void countOccurancesOfChars(String str2) {
		int count = 0;
		for (char eachChar : str2.toCharArray()) {
			for (char eachChar2 : str2.toCharArray()) {
				if (eachChar == eachChar2)
					count++;
			}

			if (count > 1) {
				System.out.println(eachChar + " repeated " + count + " times");
			}

			str2 = str2.replaceAll(String.valueOf(eachChar), "").trim();
			count = 0;
		}
	}

	public static void revString(String str3) {
		String revStr = "";

		for (int i = str3.length() - 1; i >= 0; i--) {
//			System.out.println(str3.charAt(i));
			revStr += str3.charAt(i);
		}

		System.out.println(revStr);
	}

	public static void revWordsWithoutChangingPosition(String str2) {
		String revStr = "";

		for (String eachStr : str2.split(" ")) {
			String revStr2 = "";
			for (int i = eachStr.length() - 1; i >= 0; i--) {
				revStr2 += eachStr.charAt(i);
			}
			revStr += revStr2 + " ";
		}

		System.out.println(revStr.trim());
	}

	public static void main(String[] args) {

		// Str = "Hello1234$*^*@*$" // 1+2+3+4= 10
		String str1 = "Hello1234$*^*@*$";
		sumOfNums(str1);

		String str2 = "Hello Java this is Java";
		countOccurancesOfWord(str2);
		countOccurancesOfWord("Hello Java Hello Java Hello This is This is Java Hello Java");

		countOccurancesOfChars("Hello");
		countOccurancesOfChars(str2);

		String str3 = "Hello"; // olleH

		revString(str3);
		revString(str2);

		str2 = "Hello Java this is Java"; // "olleH avaJ si avaJ"
		revWordsWithoutChangingPosition(str2);
		revWordsWithoutChangingPosition("Hello Java Hello Java Hello This is This is Java Hello Java");
		revString("Hello Java Hello Java Hello This is This is Java Hello Java");

	}

}
