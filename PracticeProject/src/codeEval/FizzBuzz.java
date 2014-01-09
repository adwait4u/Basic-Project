package codeEval;

import java.util.*;

public class FizzBuzz {
	//Expected 1 2 F 4 B F 7 8 F B for 3 5 10
	// Expected 1 F 3 F 5 F B F 9 F 11 F 13 FB 15 for 2 7 15
	public static void fizzBuzz(int a, int b, int c){
		for (int i = 1; i <= c; i++) {
			if(i%a == 0 && i%b == 0){
				System.out.print(" FB ");
			}else if(i%b == 0){
				System.out.print(" B ");
			}else if(i%a == 0){
				System.out.print(" F ");
			}else{
				System.out.print(" "+i+" ");
			}
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
		System.out.println("Please enter the nambers or press -1");
		int a = in.nextInt();
		if(a == -1){System.out.println("Thank You !");break;}else{
		int b = in.nextInt();
		int c = in.nextInt();
		fizzBuzz(a,b,c);
			}
		}
	}
	
}
