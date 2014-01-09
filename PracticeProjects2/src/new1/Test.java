package new1;

import java.util.*;


public class Test {

	static Scanner in = new Scanner (System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "Beginning";
		int len = str.length();
		
		int cnt = 0;int cnt2 = 0;
			for (int i=0; i<=len-1; i++)
			{
				for (int j=i+1; j<=len-1; j++)
				{
			
					if (str.charAt(i) == str.charAt(j))
						{	
							cnt++;
						
					if (cnt>=cnt2)
							{	
								cnt2 = cnt;
								
								//System.out.println("Does not match " +str.charAt(i)+" cnt2 is "+cnt2);
							}
						}	
				}	cnt = 0;
			}//cnt = 0;
	 
					cnt2 += 1;
					System.out.println(cnt2);
	}		

}//class ending braces
