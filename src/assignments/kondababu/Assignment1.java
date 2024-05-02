package assignments.kondababu;

public class Assignment1 {
	public void revString(String str) {
		
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
		
        System.out.println(str1);
	}

	public static void main(String[] args) {
		Assignment1 as=new Assignment1();
		as.revString("kondababu");
	}

}
