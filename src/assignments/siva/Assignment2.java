package assignments.siva;

import java.util.Arrays;

//	Write a program to print duplicate numbers in the array in a sorted order
//	Example: {10,30,10,20,40,50,30,60,50,30}  -> {10,20,30,50}

public class Assignment2 {

	public static void main(String[] args) {
		int a[] = { 10, 30, 10, 20, 40, 50, 30, 60, 50 };
		boolean flag = false;

		for (int i = 0; i <= a.length - 1; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println("after sorting array.....");

		Arrays.sort(a);
		for (int j = 0; j <= a.length - 1; j++) {

			for (int k = j + 1; k <= a.length - 1; k++) {

				if (a[j] == a[k]) {
					System.out.print(a[j] + "  ");
					flag = true;

				}

			}

		}
		if (flag == false) {

			System.out.println("no duplicates found in given array");

		}

	}
}
