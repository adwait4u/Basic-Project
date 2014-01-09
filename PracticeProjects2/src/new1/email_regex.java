package new1;
import java.io.*;
public class email_regex {
    public static void main (String[] args) throws Exception
    {
 
    	File file = new File(args[0]);
    	BufferedReader in = new BufferedReader(new FileReader(file));
    	String line = in.readLine();
    	while (line  != null) 
            //Process line of input Here
        	{
    			text = line;
				line = in.readLine();
				//System.out.println(text);
			
				// checks for validation of email ids
				if((text.contains(seq1)) && text.contains(ch))
					System.out.println("true");
				else
					System.out.println("false");
			}
		
	}
	
	//Defining variables
	private static String text = "";
	private static CharSequence seq1 = ".com";
	private static CharSequence ch = "@";
	
    
            
        
    
  
}