package codeEval;

import java.util.Scanner;

public class Fibonacci {

	public static int fibo(int a){
		if (a == 1 || a == 2){
			return 1;
			
		}else{
			a = fibo(a-1) + fibo(a-2);  
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
		System.out.println("Please enter any number or press -1");
		int a = in.nextInt();
		if(a == -1)
			break;
		else
			System.out.println(fibo(a));
		
		}

	}
}
