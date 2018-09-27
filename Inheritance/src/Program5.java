class Demo1{
	int a;
	Demo1(int d)
	{
		super();
		System.out.println("demo1 constructor"+d);
	}
}
class Demo2	extends Demo1{
	int b;
	Demo2(int s)
	{
		super(56);
		System.out.println("demo1 constructor"+s);
		 b=34;
	}
}
class Demo3 extends Demo2{

	Demo3() {
		super(78);
		System.out.println("demo3 constructor");
	}
	
}
public class Program5 {
public static void main(String[] args) {
	Demo3 d=new Demo3();
	System.out.println("a="+d.a);
	System.out.println("b="+d.b);
}
}
