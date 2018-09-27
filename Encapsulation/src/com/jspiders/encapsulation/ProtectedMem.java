package com.jspiders.encapsulation;

import com.jspiders.accessspecifiers.Program3;

class ProtectedMem extends Program3
{
	public static void main(String[] args) 
	{ 
		ProtectedMem ref=new ProtectedMem();
		System.out.println("a="+ref.a);
		ref.run();
	}
}