package interview;

import java.util.*;

public class FindMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int n = in.nextInt();
		
		int a[] = {1,5,23};
		max(a);*/
		int x[] = {100,5,23, 17, 503, 1, 0, 55};
	//}
	//public int max(int x[]){
		int maximum = x[0]; 
		for (int i=0; i<8; i++){
			if (x[i] > maximum){
				maximum = x[i];
			}
		}
		
		
		System.out.println(maximum);
		
		}
	}

