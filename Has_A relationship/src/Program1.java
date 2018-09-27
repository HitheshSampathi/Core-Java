class Battery{
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
class Mobile{
	Battery b=new Battery();
	String brand;
	double price;
	Mobile(String s,double p){
		brand=s;
		price=p;
	}
	public void call(){
		System.out.println("calling....");
		b.discharge();
	}
	public void msg(){
		System.out.println("messaging....");
		b.discharge();
	}
	public void plugin(){
		System.out.println("charger connected....");
		b.charge();
	}
}
public class Program1 {
public static void main(String[] args) {
	Mobile m=new Mobile("samsung",16000 );
	System.out.println("brand="+m.brand+" "+"price="+m.price);
	m.call();
	m.msg();
	m.plugin();
}
}
