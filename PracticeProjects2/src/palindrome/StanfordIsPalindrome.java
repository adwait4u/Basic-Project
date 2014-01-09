package palindrome;

public class StanfordIsPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "A Man, A Plan, A Canal - Panama!";
		
		
		System.out.println("Length = " + str.length());//displaying the length 
		if(isPalindrome(str)){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
		
	}

	public static boolean isPalindrome(String x){
		x = x.toLowerCase();
		// this method removes all the spl characters including spaces.
		x = x.replaceAll("\\,|\\-|\\!|\\ |\\@|\\#|\\$|\\%", "");
		System.out.println("New String is  => " + x);//displaying the new string
		if(x.length() == 3)
		{
			if (x.charAt(0) != x.charAt(2))
			{
				return false;
			}
		}
		else
		{
			 for(int i=0; i<x.length()/2; i++)
			 {
			  if(x.charAt(i) != x.charAt(x.length()-(i+1)))//checks if charAt(0) matches charAt(7-(0+1)) and so on
			  {
				return false;
			  }
		     }
			 
		 }
	    
		return true;
	}//end of method
}//end of class
