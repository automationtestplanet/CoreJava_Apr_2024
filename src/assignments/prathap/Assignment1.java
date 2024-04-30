package assignments.prathap;

public class Assignment1 {

	// Write program to count the number of repeating words and repeating characters
	// form the each work of a given sting (Sentence)
	
	public static  void countNumOfWordsAndRepeatingCharsFromEachWord(String str) {
		
		String[] strArr = str.split(" ");		
		System.out.println("No of words: "+strArr.length);		
		
		for(String eachStr:strArr) {			
			String dupChar = "";
			String eachString  = eachStr;
			for(char eachChar:eachStr.toCharArray()) {				
				if( eachStr.indexOf(eachChar) != eachStr.lastIndexOf(eachChar)){
					dupChar+=eachChar+" ";
				}				
				eachStr = eachStr.replaceAll(String.valueOf(eachChar), "");
			}
			
			if(dupChar.length() > 0) {
				System.out.println(eachString+ " has duplicate characters: "+dupChar);
			}
		}
	}

	public static void main(String[] args) {		
		countNumOfWordsAndRepeatingCharsFromEachWord("Hello this is Java Programming");
		
		
		countNumOfWordsAndRepeatingCharsFromEachWord("Welcome to core Java Programming");
	}

}
