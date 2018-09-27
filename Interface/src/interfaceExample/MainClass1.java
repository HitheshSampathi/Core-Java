package interfaceExample;
interface Program1{
	default void display() 
	{
		System.out.println("display method");
	}
	public static void test()
	{
		System.out.println("executing static method");
	}
}
class Program2 implements Program1{
	
}
public class MainClass1 {
public static void main(String[] args) {
	Program1.test();
	Program2 ref=new Program2();
	ref.display();
}
}
