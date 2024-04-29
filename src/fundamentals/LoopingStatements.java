package fundamentals;

public class LoopingStatements {

	public static void main(String[] args) {
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		
		for(int a = 1;  a <=10;a++) {
			System.out.println(a);			
		}
		
		System.out.println("----------------------------");
		
		for(int a = 1;  a <=10;a++) {
			if(a%2==1) {
				System.out.println(a);	
			}
		}
		
		
		
		System.out.println("----------------------------");
		int b = 1;
		
		while(b<11) {
			System.out.println(b);
			b++;
		}
		
		int c = 500;
		
		do {
			System.out.println(c);
		}while(c%2==0);

	}

}
