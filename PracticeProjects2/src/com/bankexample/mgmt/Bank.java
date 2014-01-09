package com.bankexample.mgmt;

public interface Bank {
	/**
	   * Function: login (String userName, String password)
	   *  This function checks the user name and password and creates the session
	   *  We have one account called testuser.
	   *   How to use:
	   *     MyBank testBank = new MyBank();
	   *     testBank.login("ACC123" , "testuser", "password");
	   *
	   *     Account: there are 2 accounts "ACC123" and "ACC555"
	   *
	   *     For test Pls use user: testuser
	   *              passowd = password.
	   */

	  public void login(String accName, String userName, String password) 
	            throws  WrongUserPasswordException, WrongAccountException ;


	  /**
	   *  Function: logOut()
	   *    This function logs out of bank application. 
	   */
	  public void logOut();

	  /**
	   *  Function: getBalance()
	   *    This function balance in your acount. 
	   *    
	   * @return  returns the balance.
	   */
	  public int getBalance();
	  
	  /**
	   *  Function: addBalance 
	   *   This function adds the money to the testuser account.
	   *   
	   *   If you have not logged in. it thorws NotInSessionException
	   *    
	   *   If you send negative number it throws WrongInputException
	   *   
	   *   Returns the added money value for verification.
	   * 
	   * @param addMoney		:Deposit the moneny
	   * @return
	   * @throws NotInSessionException
	   * @throws WrongInputException
	   */
	  public int addBalance(int addMoney) 
		throws    NotInSessionException, WrongInputException;
	  
	  /**
	   *  Function: withDraw 
	   *   This function withdraw the money from the testuser account.
	   *   
	   *   If you have not logged in. it thorws NotInSessionException
	   *    
	   *   If you send negative number it throws WrongInputException
	   *   
	   *   Returns the added money value for verification.
	   *    * @param money
	   * @return
	   * @throws NotInSessionException
	   * @throws WrongInputException
	   */
	  public int withDraw(int money) 
		throws NotInSessionException, WrongInputException;

	  /**
	   * Function transferMoney
	   *   You can transfer the money from one account to another.
	   *  
	   * @param money
	   * @param accNumber
	   * @return
	   * @throws NotInSessionException
	   * @throws WrongInputException
	   */
	  
	  public boolean transferMoney(int money, String accNumber)  
	    throws WrongInputException, NotInSessionException, WrongAccountException;


		public void reset(){
		}

}
