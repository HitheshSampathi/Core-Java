package interfaceExample;
interface Demo{
	int a=23;
	public void test();

}
class Sample implements Demo{
	public void test() {
		System.out.println("providing implementation");
	}
}
public class MainClass {
public static void main(String[] args) {
	Sample s=new  Sample();
	s.test();
	System.out.println(Demo.a);
}
}
