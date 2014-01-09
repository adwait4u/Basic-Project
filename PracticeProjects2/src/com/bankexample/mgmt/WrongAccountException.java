package com.bankexample.mgmt;

public class WrongAccountException extends Exception {
	public WrongAccountException(String x){
		System.out.println(x);
	}
}
