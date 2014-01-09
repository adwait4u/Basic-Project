package codeEval;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int a){
		boolean flag = true;
		int root = (int)Math.sqrt(a);
		for (int i = 2; i < root+1; i++) {
			if(a%i == 0)
				{
				flag = false;
				return flag;
				}else{
					flag = true;
				}
		}
				return flag;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
		System.out.println("Please enter any number greater than 1 or press -1");
		int a = in.nextInt();
		if(a == -1)
			break;
		else
		if(isPrime(a))
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
		}
	}

}
