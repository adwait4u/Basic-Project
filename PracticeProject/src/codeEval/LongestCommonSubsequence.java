package codeEval;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LongestCommonSubsequence {
	
	public void something(){
		 a1 = seq1.toCharArray();
		 a2 = seq2.toCharArray();
		 
		 for (int i = 0; i < a1.length; i++) {
			 
			for (int j = 0; j < a2.length; j++) {
				if(a1[i] == a2[j]){
					System.out.print(a2[j]+" ");
				}
			}
		}
	}
		
	// main method
	public static void main(String[] args) {
		LongestCommonSubsequence obj = new LongestCommonSubsequence();
		obj.something();
	}
	
	//declaring variable
	private  String seq1 = "XMJYAUZ";
	private  String seq2 = "MZJAWXU";
	char[] a1 = new char[seq1.length()];
	char[] a2 = new char[seq2.length()];
	private List<Character> list1 = new ArrayList<Character>();		
	private List<Character> list2 = new ArrayList<Character>();	
	// Excpected output sequence = MJAU

}
