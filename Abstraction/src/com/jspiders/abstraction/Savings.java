package com.jspiders.abstraction;

public class Savings implements Account{
	int accnum;
	String name;
	double balance;
	Savings(int accnum,String name,double balance)
	{
		this.accnum=accnum; 
		this.name=name;
		this.balance=balance;
	}

	public void deposit(double amt) 
	{
		System.out.println("amount deposited="+amt);
		balance=balance+amt;
	}

	public void withdraw(double amt)
	{
		if(amt<=balance)
		{
			System.out.println("amount withdrawn="+amt);
			balance=balance-amt;
		}else {
			System.out.println("insuffficient funds");
		}

	}

	public void checkBal() 
	{
		System.out.println("balance is="+balance);
	}

}
