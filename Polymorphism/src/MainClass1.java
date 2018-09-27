class Mobile{
	public void processor() 
	{
		System.out.println("perform task using general implementation");
	}
	public void call() {
		System.out.println("calling.....");
	}
}
class Vivo extends Mobile{
	public void processor() 
	{
		System.out.println("perform task using vivo");
	}
	public void call() {
		System.out.println("calling using vivo");
	}
}
class Samsung extends Mobile{
	public void processor() 
	{
		System.out.println("perform task using Samsung");
	}
	public void call() {
		System.out.println("calling using Samsung");
	}
}
class Nokia extends Mobile{
	public void processor() 
	{
		System.out.println("perform task using Nokia");
	}
	public void call() {
		System.out.println("calling using Nokia");
	}
}

class Factory{
	public void Manufacture(Mobile m1) {
		
		m1.processor();
		m1.call();
	}
}
public class MainClass1 {
public static void main(String[] args) {
	Factory f=new Factory();
	f.Manufacture(new Vivo());
	f.Manufacture(new Samsung());
	f.Manufacture(new Nokia());
}
}
