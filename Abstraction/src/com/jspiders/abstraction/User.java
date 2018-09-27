package com.jspiders.abstraction;

import java.util.Scanner;


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
		
		//System.out.println("please enter your balance:");
		double balance=50000;//sc.nextDouble();
		
		System.out.println("please enter your account type :");
		char type=sc.next().charAt(0); 

		Account ref=b1.getAccount(name, accnum, balance, type);

		
		int i = 0;
		while(i!=100) {
			System.out.println("please select any one option");
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			System.out.println("4.close transaction");

			switch(sc.nextInt())
			{
			case 1:System.out.println("enter amount to be withdrawn:");
					double ref1=sc.nextDouble();
					ref.withdraw(ref1);
					break;
			case 2:System.out.println("enter amount to be deposited:");
					double ref2=sc.nextDouble();
					ref.deposit(ref2);
					break;
			case 3:ref.checkBal();
					break;
			case 4:	i=99;
					System.out.println("transaction closed");
					break;
			default:System.out.println("invalid option");
			}
			i++;
		}

	}}
