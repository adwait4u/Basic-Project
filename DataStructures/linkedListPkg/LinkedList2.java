package linkedListPkg;
import java.util.*;
public class LinkedList2 {
	/**
	 * @param args
	 * This is a program that is written with the help of a tutorial 
	 * from the newboston website by Bucky Roberts
	 */
	
	
	private static void printMe(List<String> lst){
		for(String b : lst)
			System.out.print(b + " ");
		System.out.println();
	}
	
	private static void removeStuff(List<String> lst2, int from, int to){
		lst2.subList(from, to).clear();
	}
	
	private static void reverseMe(List<String> lst3){
		ListIterator<String> iter = lst3.listIterator(lst3.size());
		while(iter.hasPrevious())
			System.out.print(iter.previous()+" ");
	}
	public static void main(String[] args) {
		String[] things = {"zero", "one", "two", "three", "four"};//list 1
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] things2 = {"five", "six", "seven", "eight"};//list2
		List<String> list2 = new LinkedList<String>();
		for(String y : things2)
			list2.add(y);
		
		list1.addAll(list2);//merge lists
		list2 = null;//list 2 is null
		
		printMe(list1);//print list 1
		removeStuff(list1, 2, 5);//remove elements from 2 to 5 from list1
		printMe(list1);//print list 1
		reverseMe(list1);//print reversed list 1
	}

}
