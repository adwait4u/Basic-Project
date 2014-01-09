package hanoiProblem;

import java.util.Scanner;

public class Hanoi {
	static int count = 0;
	
	public static int hanoi(Character from, Character to, Character other, int n){
		
		if(n>0){
			hanoi(from, other, to, (n-1));
			System.out.println(from +" -> " +to);
			count++;
			hanoi(other, to, from, n-1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of disks");
		int a = in.nextInt();
		hanoi('A', 'B', 'C', a);
		System.out.println("Number of steps = "+count);
	}

}
