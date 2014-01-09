package regex;

import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;

public class RegexTestHarness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console console = System.console();
		if (console==null)
			System.err.println("No console");
			System.exit(1);
		while(true)
			{
			Pattern patt = Pattern.compile(console.readLine("%Enter your regex: "));
			
			Matcher matt = Pattern.matcher(console.readLine("Enter input string to Search: "));
			
			boolean found = false;
			while(matt.find())
			{
				console.format("I found the text "+" \"%s\" starting at "+" index %d and ending at index %d.%n",
						matt.group(),
						matt.start(),
						matt.end()
						);
				found = true;
			}
			if (!found)
				console.format("No match found. %n");
		
			}
	}

}
