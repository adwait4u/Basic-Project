package new1;

import java.util.*;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "beginning";
		// Defining and initializing the variables
		
		int len = str.length();
		HashMap tb = new HashMap<Character, Integer>();
		
		//input a to z as keys for all respective values to be 0 
		int i=1;
			while(i<27){
				for(char ch='a'; ch<='z'; ch++){
						tb.put(ch, 0);
							i++;
						}
					}
			
			
			
			for (int j=0; j<len; j++){		
						int count = (Integer) (tb.containsKey(str.charAt(j)) ? tb.get(str.charAt(j)) : 0);
						tb.put(str.charAt(j), count + 1);
						System.out.println(tb.get(str.charAt(j))+" " +str.charAt(j));
				}
			
			
	
	}//braces for main

}//braces to close the class
