class Program1
{
	public void test(){
		System.out.println("executing test method");
	}
}
class Program2 extends Program1
{
	public void test(){
		System.out.println("executing test method of subclass");
	}
}
public class MainClass {
public static void main(String[] args) {
	Program2 p2=new Program2();
	p2.test();
	
}
}
