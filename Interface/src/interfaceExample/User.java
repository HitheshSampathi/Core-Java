package interfaceExample;

import java.util.Scanner;

interface Account{
	public void withdraw( double amt);
	public void deposit( double amt);
	public void checkBal( );
}
class Savings implements Account{
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
class Loan implements Account{
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
class Bank
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
public class User
{
	public static void main(String[] args)
	{
		Bank b1=new Bank();

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name :");
		String name = sc.nextLine();
		System.out.println("please enter your account number :");
		int accnum=sc.nextInt();
		System.out.println("please enter your balance:");
		double balance=sc.nextDouble();
		System.out.println("please enter your acount type :");
		char type=sc.next().charAt(0); 

		Account ref=b1.getAccount(name, accnum, balance, type);

		ref.checkBal();
		System.out.println("enter amount to be withdrawn:");
		double ref1=sc.nextDouble();
		ref.withdraw(ref1);
		System.out.println("enter amount to be deposited:");
		double ref2=sc.nextDouble();
		ref.deposit(ref2);
		ref.checkBal();
	}
}
