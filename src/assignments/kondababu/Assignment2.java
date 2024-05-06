package assignments.kondababu;

public class Assignment2 {
// Find the freqency of character in the given string
	// intput="automation testing"
	// output=o,i,a

	public void getFreqencyOfCharacter(String str) {
		int[] freq = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}

		// Displays the each character and their corresponding frequency
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}

	}

	public static void main(String[] args) {
		Assignment2 as2 = new Assignment2();
		as2.getFreqencyOfCharacter("kondababu");

	}

}
