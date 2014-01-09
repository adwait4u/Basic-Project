package com.bankexample.mgmt;
import java.util.*;

public class BankExample{
	static Scanner in = new Scanner (System.in);

	/**
	 * @param args
	 * @throws WrongAccountException 
	 * @throws WrongUserPasswordException 
	 */
		
	
	

public static void main(String[] args) {
	BankExample obj = new BankExample();
	String accName = null;
	String userName = null;
	String password = null;

	
		System.out.println("Please enter the account Number");
		accName = in.next();
		if ((accName.equalsIgnoreCase("ACC123")) || (accName.equalsIgnoreCase("ACC555"))){
		try {
				System.out.println("Please enter the user name");
				userName = in.next();
				System.out.println("Please enter the password");
				password = in.next();
		
		}catch(WrongAccountException e1)
		{
			e1.printStackTrace();
		}
		}
		else if (userName.equals("testuser") && (password.equals("password")))
		{
			System.out.println("Welcome !");
			}else{
		
						obj.login(accName, userName, password);
				}
		
	
	
	
}
	
		
	
public void login(String accName, String userName, String password) 
		throws  WrongUserPasswordException, WrongAccountException

 	{
		WrongAccountException ac = new WrongAccountException("Wrong Account Number entered");
			throw ac;
	
 	
 	
			WrongUserPasswordException up = new WrongUserPasswordException ("Wrong Username and/or Password" );
				throw  up;
	}
}





	
  







