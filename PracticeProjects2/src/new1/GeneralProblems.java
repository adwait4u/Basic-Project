package new1;
import java.io.*;
import java.util.*;


public class GeneralProblems {

	private static Scanner x;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String email = "ohho";
		
		CharSequence seq1 = ".com";
		CharSequence ch = "@";
		
		if((email.contains(seq1)) && email.contains(ch))
			System.out.println("true");
		else
			System.out.println("false");
		
	}
	
	public void openFile(){
		try{
			x = new Scanner("NewFile.txt");
			
		}catch(Exception e){System.out.println("You have an error reading the file!");}
	}
	
	public static String readFile(){
			String a = x.next();
			System.out.println("This is something " +a);
		return a;
		
		
	}
		
}

