//Propagation of unchecked exception
class Demo3{
	public void test3() {
		System.out.println("executing test3 method");
		int a=32/0;
	}
}
class Demo2{
	public void test2() {
		System.out.println("executing test2 method");
		new Demo3().test3();
	}
}
class Demo1{
	public void test1() {
		System.out.println("executing test1 method");
		new Demo2().test2();

	}
}
public class Program4 {
public static void main(String[] args) {
	try 
	{
	new Demo1().test1();
	}
	catch(ArithmeticException ref)
	{
	System.out.println("exception handled"+ref);
	ref.printStackTrace();
}
}
}
