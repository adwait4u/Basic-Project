package arrayTable;
import java.util.*;

public class ArrayTable {

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
	
	public static int table(int a, int b){
		int[][] myArray = new int[a*10][b*10];
		for (int i=1; i<a+1; i++)
		{
			for (int j=1; j<b+1; j++)
			{
				myArray[i][j] = i*j ;
				System.out.print( myArray[i][j] + "\t");
			}
			System.out.println(" ");
		}
		return 0;
		
		
	}
}
