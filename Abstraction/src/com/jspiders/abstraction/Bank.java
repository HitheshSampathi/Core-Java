package com.jspiders.abstraction;

public class Bank
{
	public Account getAccount(String name,int accnum,double balance,char type) {
		Account ref=null;
		if(type=='s')
		{
			ref=new Savings(accnum,name,balance);
		}
		else {
			ref=new Loan(accnum, name, balance);
		}
		return ref;

	}
}