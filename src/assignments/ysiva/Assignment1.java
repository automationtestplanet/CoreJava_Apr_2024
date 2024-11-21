package assignments.ysiva;

public class Assignment1 {

//	Write a reusable method print Even and Odd numbers from the given range

	public  void checkGivenNumEvenOrOdd(int num) {

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Numbers   :" + i);
			} else {
				System.out.println("Odd Number     :" + i);
			}
		}

	}

	public static void main(String[] args) {
		Assignment1 as = new Assignment1();
		as.checkGivenNumEvenOrOdd(50);
}
}