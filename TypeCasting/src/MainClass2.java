class Demo1{
	int a=10;
	public void disp() {
		System.out.println("executing disp method");
	}
}
class Demo2 extends Demo1{
	int b=10;
	public void test() {
		System.out.println("executing test method");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		Demo1 d1=new Demo2();//upcasting
		System.out.println("a="+d1.a);
		d1.disp();
		//d1.test(); error

	}

}
