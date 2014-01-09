package primeNumber;

import java.util.*;

public class PrimalityCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		println("Please enter a number greater than 2");
		int a = in.nextInt();
		if (isPrime(a)){
		println("The number you entered is a prime number");
		}else{
			println("The number you entered is not a prime number");
		}
	}
	private static boolean isPrime(int n){
		boolean flag;
		if (n<0 || n==0 || n==1){
			println("You have entered wrong values");
			return false;
		}else if (n==2){
			return true;
		}else if (n % 2 == 0){
			return false;
		}else {
			flag = true;
			int divisor = 3;
			int upperLimit = (int)Math.sqrt(n) + 1;
			//println("UL is "+upperLimit + " " + divisor + " " + n);
			while(divisor <= upperLimit)
			{	//println("Inside the while loop n rem divisor is " + (n % divisor));
				if (n % divisor == 0)
				{
					flag = false;
				}
				
				divisor += 2;
			}
		}
		return flag;
	}
	private static void println(String x){
		System.out.println(x);
	}

}
