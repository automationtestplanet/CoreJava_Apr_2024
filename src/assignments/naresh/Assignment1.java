package assignments.naresh;

public class Assignment1 {
//write reuseble method and print gievn range of 1 to 100 even and odd numbers

	public void displayEvenAndOddNumbers(int num) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("Even numers are :" + i);
			} else {
				System.out.println("Odd numers are  :" + i);
			}
		}

	}

	public static void main(String[] args) {
		Assignment1 a1=new Assignment1();
		a1.displayEvenAndOddNumbers(100);

	}

}
