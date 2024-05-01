package assignments.ksrikanth;

public class Assignment1 {

//	Write a reusable method print Even and Odd numbers from the given range 

	public static void printEvenAndOddNum(int a, int b) {
		System.out.println("Odd Numbers:");
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		System.out.println("Even Numbers");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printEvenAndOddNum(1, 10);
	}
}