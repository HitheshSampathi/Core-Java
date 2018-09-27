package interfaceExample;

interface Demo3{	//multiple  inheritance
	public void test();
}
interface Demo4 {
	public void test();
}
class Sample9{
	int a=99;
}
class Sample5 extends Sample9 implements Demo3,Demo4 
{
	public void test() {
		System.out.println("implementation of test");
	}
	
}
public class MainClass3 {
public static void main(String[] args) {
	Sample5 s5=new Sample5();
	System.out.println(s5.a);
	s5.test();
}
}