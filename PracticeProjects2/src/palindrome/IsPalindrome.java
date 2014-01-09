package palindrome;
import java.util.*;

public class IsPalindrome {

	static Scanner in = new Scanner(System.in);
	/**
	 * Accept any string from the user and check if its  palindrome 
	 * by calling isPalindrome method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a string");
		String x = in.next();
		if (isPalindrome(x)){
			System.out.println("The string is a Palindrome");
		}else{
			System.out.println("The string is not a Palindrome");

		}
		//Exercise for String concatenation
		String a = new String ("Hello");
		String b = new String (" World This Is Java");
		String a1 = a.concat(b);
		System.out.println(a1);
		//Splitting the string and printing it
		String[] a2 = a1.split(" ");
			for (String str : a2){
				System.out.println(str);
				}
	}
	private static boolean isPalindrome(String x) {
		boolean flag = true;//Setting flag to True
		int len = x.length(); // getting the length of the string
		StringBuffer x2 = new StringBuffer(x);
		String str = x2.toString();
		int cap = x2.capacity();
System.out.println("Len is " +len);
System.out.println("Cap is " +cap);
System.out.println("str is  " +str);

/*For first letter to center of the string check if all of the characters match.
 * If so then set its a palindrome example DAD
 * otherwise its not a palindrome example DADA
 */
		for (int i=0; i!=(len/2);i++){
			if (x.charAt(i) != x.charAt(len-i-1)){
				flag = false;
			}else{
				flag = true;
				}
		}
		return flag;
	}

}
