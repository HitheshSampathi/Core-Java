class Demo1{
	static double b=6.7;
	public static void test()
	{
		System.out.println("test method");
	}
}
public class Program3 {
public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("b="+Demo1.b);
	Demo1.test();
	System.out.println("main method started");
}
}
