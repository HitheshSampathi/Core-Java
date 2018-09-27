class Demo1{
	int a=25;
}
class Demo2 extends Demo1{
	double b=2.3;
}
class Demo3 extends Demo2{
	int c=27;
}

public class MainClass
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo2();//upcasting
		if(d1 instanceof Demo3) {
			System.out.println("properties of Demo3 are present");
			Demo3 d3=(Demo3)d1;//downcasting
		}
		else if(d1 instanceof Demo2) {
			System.out.println("properties of Demo2 are present");
			Demo2 d3=(Demo2)d1;//downcasting
			
		}
		else {
			System.out.println("properties are not present");
		}
	}
}
