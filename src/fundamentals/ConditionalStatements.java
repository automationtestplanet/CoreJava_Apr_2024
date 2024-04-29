package fundamentals;

import java.util.Date;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		int a = 90;
		
		if(a >= 100) {
			System.out.println(a);
		}
		
		if(a >= 100) {
			System.out.println(a);
		}else {			
			System.out.println("A value is less tha 100");
		}
		
		
		if(a >= 100) {
			System.out.println(a);
		}else if (a==99){
			System.out.println(a);
		}else{			
			System.out.println("A value is less tha 99");
		}
		
		a = 101;
		
		if(a >= 100) {			
			if(a == 100) {
				System.out.println(a);
			}else {
				System.out.println("A is not equals to 100");
			}
			
		}else if (a==99){
			System.out.println(a);
		}else{			
			System.out.println("A value is less tha 99");
		}
		
		
		if(a >= 100 || a ==101) {
			System.out.println(a);
		}else {			
			System.out.println("A value is less tha 100");
		}
		
		
		System.out.println(new Date());
		
		System.out.println(new Date().getHours());
		
		
		if(new Date().getHours() >= 1 && new Date().getHours() <= 12 ) {			
			System.out.println("Hello!!!! Good Morning");			
		}else if(new Date().getHours() >= 12 && new Date().getHours() <= 18) {
			System.out.println("Hello!!!! Good Afternoon");
		}else {
			System.out.println("Hello!!!! Good Evening");
		}
		
		String accountType = "CURRENT ACCOUNT";
		
		switch (accountType) {
		case "SAVINGS ACCOUNT":
			System.out.println("DepositLimit 200000");
			break;
		case "CURRENT ACCOUNT":
			System.out.println("DepositLimit 1000000");
			break;
			
		case "RETAILER ACCOUNT":
			System.out.println("DepositLimit 2000000");
			break;
		default:
			break;
		}
		
		
		
	}

}
