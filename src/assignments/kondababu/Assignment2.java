package assignments.kondababu;

public class Assignment2 {
// Find the freqency of character in the given string

	public void getFreqencyOfCharacter(String str) {
		int[] freq = new int[str.length()];
		char string[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1; 
			for (int j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;

					string[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for (int i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}

	}

	public static void main(String[] args) {
		Assignment2 as2 = new Assignment2();
		as2.getFreqencyOfCharacter("automationtesting");

	}

}
