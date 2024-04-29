package fundamentals;

public class ArraysExample {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50 };

		System.out.println(a);

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);

		System.out.println(a.length);

//		for(int i = 0; i < a.length; i++) {			
//			System.out.println(a[i]);
//		}

//		Enhanced For loop

		for (int eachValue : a) {
			System.out.println(eachValue);
		}

		String[] strArr = { "String1", "String2" };

		int[][] twoDarr = { { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 }, { 1000, 2000, 3000, 4000, 5000 } };

		System.out.println(twoDarr.length);

		for (int[] eachArr : twoDarr) {
			System.out.println(eachArr.length);
		}

		int int1;

		int1 = 100;

		int[] intArr = new int[5];

		for (int eachVal : intArr) {
			System.out.println(eachVal);
		}

		intArr[0] = 10000;
		intArr[1] = 20000;
		intArr[2] = 30000;
		intArr[3] = 40000;
		intArr[4] = 50000;

//		intArr[5] = 60000;

		for (int eachVal : intArr) {
			System.out.println(eachVal);
		}

		for (int[] eachArr : twoDarr) {
			for (int eachVal : eachArr) {
				System.out.println(eachVal);
			}
		}

		

	}

}
