package assignments.gopi;

public class Assignment3 {

	// Print transpose of matrix
//	i/p:[  1 2 3
//	
//	      4 5 6 
//		
//	      7 8 9 ]
//				
//	o/p:[  1 4 7
//			
//		   2 5 8 
//			
//		   3 6 9 ]

	public static void main(String args[]) {
		int original[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(original[j][i] + " ");
			}
			System.out.println();
		}
	}

}
