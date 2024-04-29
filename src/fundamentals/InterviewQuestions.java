package fundamentals;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		int a = 100; int b = 200;
		//swap two numbers without using 3rd variable
		// int a = 200, int b = 100;
		
//		int c = a;		
//		a = b;		
//		b = c;		
//		System.out.println(a);
//		System.out.println(b);
		
		a = a+b;  // 300		
		b = a-b; // 100;		
		a = a-b; // 200
		
		System.out.println(a);
		System.out.println(b);
		
		
		int[] arr1 = { 50, 20, 40, 10, 30 };  // o/p : 10,20,30,40,50
		
		// 20, 40, 10, 30, 50		
		// 20,10,30,40,50
		//10,20,30,40,50

		System.out.println("-----------Before Soting-------------------");

		for (int eachVal : arr1) {
			System.out.println(eachVal);
		}
		
		for(int i = 0; i < arr1.length; i++) {			

			for(int j = i+1; j < arr1.length; j++) {
				int temp = 0;				
				if(arr1[i] > arr1[j]) {					
					temp = arr1[j];
					arr1[j] = arr1[i];					
					arr1[i] = temp;					
				}
			}
		}
		
		System.out.println("-----------Before Soting-------------------");
		
		for (int eachVal : arr1) {
			System.out.println(eachVal);
		}
		
		System.out.println(arr1[arr1.length-1]);
		
		int[] arr2 = { 50, 20, 40, 10, 30 }; 
		
		int highVal = 0;
		
		for (int eachVal1 : arr2) {
			if(eachVal1 > highVal) {
				highVal = eachVal1;
			}
		}		
		System.out.println(highVal);
		
		System.out.println("-----------Sum Of Array Elements-------------------");
		
		int sum = 0;
		for (int eachVal1 : arr2) {
			sum+=eachVal1;   // sum = sum+eachVal1;
		}
		
		System.out.println(sum);
		
		System.out.println("----------Patteren1-------------------");
		
		for(int i =1; i <=5; i++) {
			for(int j =1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------Patteren2-------------------");
		
		for(int i =5; i >=1; i--) {
			for(int j =1; j <=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------Find Duplicates from Array-------------------");
		int[] arr3 = { 50, 20, 50, 10, 20, 40, 60,70,30,50,20,10};
		
		int count = 0;
		
		for (int eachVal1 : arr3) {
			for (int eachVal2 : arr3) {
				if(eachVal1 == eachVal2)
					count++;
			}
			
			if(count>=2)
				System.out.println(eachVal1+ " is repeating "+count+" times" );
			
			count=0;
		}

	}

}
