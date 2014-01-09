package queuePkg;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	//filling up the queue
	public static void createQue(){
		for (int i = 0; i < 5; i++) {
			que.add((int) (Math.random()*100));
		}
	}
	
	//emptying all from the queue
	private static void emptyAllQue() {
		while(!que.isEmpty())
			que.remove();
	}

	//remove elements that are greater than or equal to 30 without emptying the queue
	public static void removeWOEmptying(){
		int size = que.size();
		System.out.println("Size of the que is "+size);
		for (int i = 0; i < size; i++) {
			int elem = que.remove();
			if(elem >=30){
				System.out.println("Removed "+elem);
				que.add(elem);
				System.out.println("Added "+elem);
			}
		}
	}
	
	//printing a queue
	public static void printQue(){
		System.out.println(que);
	}
	
	//main method
	public static void main(String[] args) {
		createQue();
		System.out.println("The original queue is");
		printQue();
		System.out.println("The front of the queue is "+que.peek());
		removeWOEmptying();
		printQue();
		emptyAllQue();
		System.out.println("\n"+que+" is the empty queue now");

		
	}//end of main
	

	//queue defined
	public static Queue<Integer> que = new LinkedList<Integer>();

}//end of class
