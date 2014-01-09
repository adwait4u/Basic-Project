/*====================================================================
*
* This program validates user inputs for Email / Phone numbers
* A provision to improve the code for validating IP address is 
* also available. One can make changes accordingly.
* Author: Adwait Paranjpe
* Date: 09 July 2013
*
*====================================================================*/

package regularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void regexCheck(String x, int a){
		System.out.println("You entered -> " + x);
		if (a==1){
		/********************* Regex for Phone number ******************************************/
		
		String phoneRegex = "^(\\()?\\d{3}(\\)|\\.||-|\\s)*\\d{3}(\\.|\\s|-)?\\d{4}$";
		
		Pattern pattPhone = Pattern.compile(phoneRegex);
		Matcher matchPhone = pattPhone.matcher(x);
	
		if(!matchPhone.matches())
			System.out.println("This is an invalid Phone number");
		else
			System.out.println("This is a VALID Phone number");
		
	}
	else if(a == 2){
		/******************************* Regex for Email ID ************************************/
		//String emailRegex = "^[a-z0-9_\\+-]+(\\.[a-z0-9_\\+-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*\\.([a-z]{2,4})$";
		String emailRegex = "^[\\w\\d_\\+-]+(\\.[\\w\\d_\\+-]+)*@[\\w\\d-]+(\\.[\\w\\d-]+)*\\.(\\d{2,4})$";
		
		Pattern pattEmail = Pattern.compile(emailRegex);
		Matcher matchEmail = pattEmail.matcher(x);
		
		if(!matchEmail.matches())
			System.out.println("This is an invalid Email");
		else
			System.out.println("This is a VALID Email");
		/***************************************************************************************/
		}
	}
	/********************************************************************************************/
	/************************	            MAIN method				   **************************/
	/********************************************************************************************/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number for the item you want to check");
		System.out.println("1: For checking a phone number");
		System.out.println("2: For checking a email address");
		System.out.println("3: For checking a IP address");
		int a = in.nextInt();
		switch (a) {
			case 1:
				System.out.println("Enter the phone number");
				in.nextLine();
				str1 = in.nextLine();
				
				break;
				
			case 2:
				System.out.println("Enter the email address");
				str1 = in.next();
				break;
				
			case 3:
				System.out.println("Enter the IP adress");
				str1 = in.next();
				break;
	
			default:
				break;
		}
		regexCheck(str1, a);
	}
	
	//variable
	private static String str1;
	
}
