package factorial;

import java.util.Scanner;

public class FactorialCalculator {
	static Scanner in = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		println("Please enter the number");
		int a = in.nextInt();
		println("The factorial of the number is "+factorial(a));
		println("Enter another number ");
		int b = in.nextInt();
		println("The fibbonacci series until "+b+ " places is as follows:- ");
		fiboSeries(b);
	}

	private static long factorial(int n){
		if (n<=1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
	private static int fiboSeries(int n){
		for (int i=0; i<n; i++){
			System.out.println(fibo(i+1));
		}
		return 0;
	}
	
	private static int fibo(int n){
		if (n<-1)
		{
			return 1;
		}
		else
		{
			return fibo(n-1) + fibo(n-2);
		}
		
	}
	protected static void println(String x) {
		System.out.println(x);
		}

}
