class Battery1{
	int capacity=3000;
	public void charge()
	{
		System.out.println("mobile gets charged");
	}
	public void discharge()
	{
		System.out.println("mobile gets discharged");
	}
	
}
class Mobile1{
	 static Battery1 b=new Battery1();
	static String brand;
	static double price;
	Mobile1(String s,double p){
		brand=s;
		price=p;
	}
	public void call(){
		System.out.println("calling....");
		
	}
	public void msg(){
		System.out.println("messaging....");
		
	}
	public void plugin(){
		System.out.println("charger connected....");
		
	}
}
public class Program2 {
public static void main(String[] args) {
	Mobile1 m=new Mobile1("samsung",16000 );
	System.out.println("brand="+Mobile1.brand+" "+"price="+Mobile1.price);
	m.call();
	Mobile1.b.discharge();	
	m.msg();
	Mobile1.b.discharge();
	m.plugin();
	Mobile1.b.charge();
	System.out.println("end");
}
}
