package com.jspiders.encapsulation;
 class DataBase{
	private static DataBase ref=null;
	private DataBase() {
		System.out.println("object created");
	}
	public static DataBase getObject() {
		if(ref==null) {
			ref=new DataBase();
		}
		return ref;
		
	}
	public void StoreData(String s1) {
		System.out.println("storing data "+s1);
	}
}
public class SingleTon 
{
	public static void main(String[] args) {
		DataBase d1=DataBase.getObject();
		System.out.println(d1);
		d1.StoreData("java"); 
		
		DataBase d2=DataBase.getObject();
		System.out.println(d2);
		d2.StoreData("sql");
		
		DataBase d3=DataBase.getObject();
		System.out.println(d3);
		d3.StoreData("j2ee");
	}
}
