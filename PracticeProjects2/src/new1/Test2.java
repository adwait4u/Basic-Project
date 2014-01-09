package new1;
import java.util.*;

public class Test2 {
	static int cnt = 0;static int cnt2 = 0;
	char ch = 0; char ch2 = 0;


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter any string");
		String str = in.next();
		// Defining and initializing the variables
		
		
		
		Test2 obj1 = new Test2();
		cnt2 = obj1.maxNumOccur(str);
		System.out.println("The character appears most that is "+cnt2 +" number of times");
		
		
	}	
		
	public static int maxNumOccur(String x){
		int len = x.length();
		
	
		for (int i=0; i<=len-1; i++)
			{
				for (int j=i+1; j<=len-1; j++)
				{
			//check if any of the characters match
					if (x.charAt(i) == x.charAt(j))
						{	
							cnt++;
							//ch = x.charAt(i);
				//check the number of occurrences the match is found
					if (cnt>=cnt2)
							{	
								cnt2 = cnt; //assigning the number of occurrences

								//ch2 = ch; //assigning which character occured more number of times
							}
						}	
				}	cnt = 0;
			}
	 
					cnt2 += 1;
					return cnt2;
		//			System.out.println(ch2+" " + cnt2);
		}
	

}    
