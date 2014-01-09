package interview;
import java.util.*;
public class StarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n = in.nextInt();
		Star(n);
	}
	public static void Star(int a){
		for (int i=1; i<=a; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
