package assignments.kraju;

public class Assignment1 {

	// Write a reusable method check whether the number is Armstrong number or not
	// 153 -> 1^3 + 5^3 + 3^3 -> 1+125+27 => 153
	public void checkArmStrongNumber(int num) {

		int result = 0;
		int rem;
		int temp = num;

		while (num > 0) {

			rem = num % 10;
			result = result + (rem * rem * rem);
			num = num / 10;
		}
		if (result == temp) {
			System.out.println("Given number is  armstorng number");
		}

		else {
			System.out.println("Given number is not a armstorng number");
		}

	}

	public static void main(String[] args) {
		Assignment1 am=new Assignment1();
		am.checkArmStrongNumber(407);

	}
}
