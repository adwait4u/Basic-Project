package codeEval;

import java.util.StringTokenizer;

public class StringRevByWord {
	
	public static void stringReverse(){

	StringBuilder result = new StringBuilder();
    StringTokenizer st = new StringTokenizer(input, " ");
    while (st.hasMoreTokens()) {
        StringBuilder thisToken = new StringBuilder(st.nextToken());
        result.append(thisToken.reverse() + " ");
    }
    	String resultString = result.toString();
    	System.out.print(resultString+"\"");
	}
    
    public static void main(String[] args) {
    	System.out.println("The original string is \""+ input+"\"");
    	System.out.print("The reversed string is \"");
    	stringReverse();
	}
    
    public static String input = "This is the original string";

}
