package stackPkg;

import java.util.Stack;

public class StackClass {
	// find Max method
	public static int findMax(Stack<Integer> s){
		Stack<Integer> backUp = new Stack<Integer>();
		int max = s.pop(); //remove an element from original stack
		backUp.push(max); // add the removed element to the backUp stack
		
		while(!s.isEmpty()){
			int next = s.pop();
			backUp.push(next);
			max = Math.max(max, next);
		}
		
		while(!backUp.empty()){
			s.push(backUp.pop());
		}
		
		return max;
	}
	
	// empty all the stack
	public static void emptyAll(){
		System.out.println("Emptying the stack");
		while(!sInt.isEmpty())
			System.out.print(sInt.pop()+" ");
		
	}
	
	//fill in Stack
	public static void fillAll(){
		for (int i = 1; i < 5; i++) {
			sInt.push((int) (Math.random()*100)); 
		}
	}
	
	// main method
	public static void main(String[] args) {
		fillAll();
		System.out.println("The original stack is "+sInt);
		System.out.println("The top of the stack is "+sInt.peek());
		System.out.println("The maximum value in the stack is "+findMax(sInt));
		System.out.println("The original stack remains "+sInt);
		emptyAll();
		System.out.println("\n"+sInt+" is the empty stack now");
		
	}//end of main
	
	//Stack defined
	public static Stack<Integer> sInt = new Stack<Integer>();
	
}
