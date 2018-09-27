package interfaceExample;
interface Prgram2{	//multiple  inheritance
	public void disp();
}
interface prgram1 {
	public void test();
}
class Sample6 implements prgram1,Prgram2{

	public void disp() {
		System.out.println("implementation of disp ");
		
	}

	public void test() {
		System.out.println("implementation of test");
	}
	
}
public class MainClass4 {
public static void main(String[] args) {
	Sample6 s6=new Sample6();
	s6.disp();
	s6.test();
}
}
