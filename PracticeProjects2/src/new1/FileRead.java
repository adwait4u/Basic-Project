package new1;

import java.io.*;

public class FileRead {

	/**
	 * First the program creates a FileReader object followed by a BufferedReader object
	 * Then the bufferedReader object reads the file line by line
	 * The method checks if the file contains the valid email addresses by 
	 * checking if the lines in the file contains sequence '@' and sequence '.com' 
	 * and returns the results as TRUE or False 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		try{
			FileReader fr = new FileReader("/Users/adwait/Documents/NewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			
			
			String line = br.readLine();
			while(line != null)
			{
				text = line;
				line = br.readLine();
			
		// checks for validation of email ids
				if((text.contains(seq1)) && text.contains(ch))
					System.out.println("true");
				else
					System.out.println("false");
			}
		}catch(Exception ex){
			
		}
	}
	
	//Defining variables
	private static String text = "";
	private static CharSequence seq1 = ".com";
	private static CharSequence ch = "@";
	

}
