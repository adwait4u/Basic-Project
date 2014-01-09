package mult;

import java.util.Scanner;

public class MultTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int row; int col;
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the number of rows and columns in the table");
		row = in.nextInt();
		col = in.nextInt(); 
		table(row, col);
	}
	
	public static int table(int a, int b)
	{	
			if(a<=0 || b<=0)
			{
				System.out.println("You have entered invalid inputs");
			}
			else
			{
			int c;
		    for (int i=1; i<a+1; i++)
		    	{
		        for (int j=1; j<b+1; j++)
		        	{
		        	c=i*j;
		        	System.out.print(c+"\t\t");
		        	}	
		        System.out.println(" ");
		       // TODO Auto-generated method stub
		    	}
			
			}
		
			
		
		return 0;

	}
}



