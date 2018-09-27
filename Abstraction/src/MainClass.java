abstract class Sample{
	Sample(){
		System.out.println("executing abstract class constructor");
	}
	abstract void test();
	static int a=12;
	double b=78.98;
	public static void disp() {
		System.out.println("executing static method");
	}
	public void run() {
		System.out.println("executing non-static method");
	}
}
class Sample2 extends Sample{

	void test() {
		System.out.println("providing implementation");

	}

}
public class MainClass {
	public static void main(String[] args) {
		System.out.println("a="+Sample.a);
		Sample2 s2=new Sample2();
		s2.run();
		s2.test();
	}
}
