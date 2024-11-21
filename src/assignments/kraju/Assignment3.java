package assignments.kraju;

public class Assignment3 {

	
	//Print transpose of matrix
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

       public void convertTransposeMatrix(int a[][]) {
		System.out.println("enter no of rows:" + a.length);
		System.out.println("enter no of colomns:" + a[0].length);
		System.out.println("Original Matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("converting Transpose Matrix");
		for (int i = 0; i < a[0].length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[j][i]);
			}
			System.out.println();
		}
	}
    
	   public static void main(String[] args) {
		   Assignment3 arr = new Assignment3();
		int trans[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		arr.convertTransposeMatrix(trans);
	}
}


	
