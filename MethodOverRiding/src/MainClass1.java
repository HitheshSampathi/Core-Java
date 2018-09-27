class Program3
{
	final public void test(){
		System.out.println("executing test method");
	}
}
class Program4 extends Program3
{
	//we can't override final methods
}
public class MainClass1 {
public static void main(String[] args) {
	Program4 p4=new Program4();
	p4.test();
	
}
}
