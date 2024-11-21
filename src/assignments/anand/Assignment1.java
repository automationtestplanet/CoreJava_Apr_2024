
package assignments.anand;

public class Assignment1 {
	
	//Write a reusable method check whether the string is Pallendrome or not
	// i/p: AbcbA  -> AbcbA
	// AbcaB  -> BacbA


    public static void main(String[] args) {
        String str = "abcba";
        if(isPalindrome(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
