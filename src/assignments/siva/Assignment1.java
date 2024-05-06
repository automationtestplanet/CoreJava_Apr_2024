package assignments.siva;

public class Assignment1 {

//	Write a reusable method check the number is prime or not
	// it divisible by 1 and it self.

	// 2 -> 2
	// 3, 5, 7, 11, 13, 17, 19

	public static void checkPrimeNumberOrNot(int n) {
		int i, m;
		int flag = 0;
		m = n / 2;

		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println(n+ "  is not a prime number");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(n+ "  is  a prime number");
		}
	}

	public static void main(String[] args) {
		checkPrimeNumberOrNot(2);

	}
}
