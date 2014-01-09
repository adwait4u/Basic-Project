package new1;

import java.util.*;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter any string");
		String str = in.next();
		// Defining and initializing the variables
		int cnt = 0; int cnt2 = 0;
		int len = str.length();
		Hashtable tb = new Hashtable();
	
		for (int i=0; i<=len-1; i++)
			{
				for (int j=i+1; j<=len-1; j++)
				{
			//check if any of the characters match
					if (str.charAt(i) == str.charAt(j))
						{	
							cnt++;
							tb.put(cnt, str.charAt(i));
				//check the number of occurrences the match is found
					if (cnt>=cnt2)
							{	
								cnt2 = cnt; //assigning the number of occurrences

							}
						}	
				}	cnt = 0;
			}
	 
					System.out.println(tb.get(cnt2) +" "+(cnt2+1));
		}

}
