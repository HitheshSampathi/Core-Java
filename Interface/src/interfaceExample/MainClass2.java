package interfaceExample;
interface Prgm2{	//multi level inheritance
	public void disp();
}
interface prgm1 extends Prgm2{
	public void test();
}
abstract class Sampl1 implements prgm1{
	public void test() {
		System.out.println("implementation of test method");
	}
}
class Sampl2 extends Sampl1{

	
	public void disp() {
		System.out.println("implementation of disp method");
	}
	
}

public class MainClass2 {
public static void main(String[] args) {
	Sampl2 ref=new Sampl2();
	ref.disp();
	ref.test();
}
}
