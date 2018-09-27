import java.io.IOException;

//Propagation of unchecked exception
class Sample3{
	public void test3() throws IOException {
		System.out.println("executing test3 method");
		throw new IOException();
	}
}
class Sample2{
	public void test2() throws IOException {
		System.out.println("executing test2 method");
		new Sample3().test3();
	}
}
class Sample1{
	public void test1() throws IOException {
		System.out.println("executing test1 method");
		new Sample2().test2();

	}
}
public class Program6 {
public static void main(String[] args) {
	try 
	{
	new Sample1().test1();
	}
	catch(IOException ref)
	{
	System.out.println("exception handled"+ref);
	ref.printStackTrace();
}
}
}
