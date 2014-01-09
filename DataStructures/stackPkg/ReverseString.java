package stackPkg;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Stack createStack(String str){
		
		char[] a = new char[str.length()];
		a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			s.push(a[i]);
		}
		System.out.println(s);
		return s;
	}
	public void popStack(@SuppressWarnings("rawtypes") Stack s){
		System.out.println("The reversed string is");
		while(!s.isEmpty()){
			System.out.print(s.pop()+" ");
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = in.nextLine();
		ReverseString obj = new ReverseString();
		obj.popStack(obj.createStack(str));
		
	}
	
	//private String str = "Beginning"; 
	@SuppressWarnings("rawtypes")
	private Stack s = new Stack();
	
}

