package com.bankexample.mgmt;

public class WrongUserPasswordException extends Exception {
		public WrongUserPasswordException(String x){
			System.out.println(x);
		}
}
