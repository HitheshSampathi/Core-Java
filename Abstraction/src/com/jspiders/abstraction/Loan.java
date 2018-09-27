package com.jspiders.abstraction;


public class Loan implements Account{
	int accnum;
	String name;
	double balance;
	Loan(int accnum,String name,double balance)
	{
		this.accnum=accnum;
		this.name=name;
		this.balance=balance;
	}

	public void withdraw(double amt) 
	{
		System.out.println("amount deposited="+amt);
		balance=balance+amt;
	}

	public void deposit(double amt)
	{
		if(amt<=balance)
		{
			System.out.println("amount deposited="+amt);
			balance=balance-amt;
		}else {
			System.out.println("cant accept more than required");
		}

	}

	public void checkBal() 
	{
		System.out.println("balance is="+balance);
	}

}
