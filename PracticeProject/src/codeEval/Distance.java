package codeEval;

import java.io.*;
import java.util.Scanner;

public class Distance {

	public static int dist(int a, int b, int c, int d){
		int X = (int) Math.pow((c-a), 2);
		int Y = (int) Math.pow((d-b), 2);
		int distance = (int) Math.sqrt(X+Y);
		
		return distance;
	}
	
	// @SuppressWarnings("unused")
	private static Integer valueOf(String text) {
			
		 int x = Integer.parseInt(text);
		
		return x;
	} 

	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("The ditance between the points is "+dist(25,4,1,-6));
		System.out.println("The ditance between the points is "+dist(47, 43, -25, -11));
		
		
		//reading text file
		FileReader file = new FileReader("/Users/adwaitparanjpe/findDistance.txt");
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader(file);
		
		int [] numbers = new int[100];
		String line = reader.readLine();
		int i = 0;
		while (line != null){
			try{
				 if (line.trim().length() == 0) {
				        continue;
				    }
				 else{
				numbers[i] = Integer.parseInt(line);
			
			i++;
			line = reader.readLine();
				 }
			}catch(NumberFormatException ex){
				continue;
			}
		}
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		
		/*
		String text ="";
		String line = reader.readLine();
		while(line != null){
			text = line;
			line = reader.readLine();
			text = text.replaceAll("\\_|\\.|\\@|\\%|\\$|\\s|\\(|\\)|\\,"," ");
			System.out.println(text);	
			System.out.println("NextLine");
			
		
		}*/
	}
}


