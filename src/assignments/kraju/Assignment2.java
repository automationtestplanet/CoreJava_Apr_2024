package assignments.kraju;

public class Assignment2 {
//	Write a program to print fibonacci series for the given range
//	Ex: 1 to 10 -> 0,1,1,2,3,5,8
//		1 to 20 -> 0,1,1,2,3,5,8,13
	public void displayFibonacciSeries(int num) {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i <= num; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

	public static void main(String[] args) {

		Assignment2 ass = new Assignment2();
		ass.displayFibonacciSeries(10);
	}
}
