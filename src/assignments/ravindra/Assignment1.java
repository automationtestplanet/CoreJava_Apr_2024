package assignments.ravindra;

public class Assignment1 {

//	Write a reusable method print Even and Odd numbers from the given range
	
	
    public static void printEvenAndOddNumbersForGivenRange(int start, int end) {
		System.out.println("Even numbers:");
		for (int i = start; i <= end; i++) {
		    if (i % 2 == 0) {
		        System.out.print(i + " ");
		    }
		}
		System.out.println("\nOdd numbers:");
		for (int i = start; i <= end; i++) {
		    if (i % 2 != 0) {
		        System.out.print(i + " ");
		    }
		}
	}
    public static void main(String[] args) {
    	printEvenAndOddNumbersForGivenRange(1,50); 
	}
}


