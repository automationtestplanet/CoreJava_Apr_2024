package assignments.prabandha;

public class Assignment1 {

	// Write a reusable method check whether the string is Pallendrome or not

	private static final int i = 0;

	public static boolean Pallendrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++)
			if (str.charAt(i) != str.charAt(n - i - 1))
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Pallendrome("AbcbA"));
		System.out.println(Pallendrome("AbcaB"));

	}
}
