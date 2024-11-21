package assignments.srinath;

public class Assignment3 {

//	Write a program to print fibonacci series for the given range

//	Ex: 1 to 10 -> 0,1,1,2,3,5,8
//		1 to 20 -> 0,1,1,2,3,5,8,13

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		int i;
		int count = 7;
		System.out.print("1 to 10 ->");
		System.out.print(a + " , " + b);

		for (i = 2; i < count; ++i) {
			c = a + b;
			System.out.print(" , " + c);
			a = b;
			b = c;
		}

		int d = 0;
		int e = 1;
		int f;
		int j;
		int count1 = 8;
		System.out.println(" ");
		System.out.print("1 to 20 ->");
		System.out.print(d + " , " + e);

		for (j = 2; j < count1; ++j) {
			f = d + e;
			System.out.print(" , " + f);
			d = e;
			e = f;
		}

	}

}
